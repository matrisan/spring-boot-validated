基础校验 异常处理的几种方式 @Valid 和 @Validate 区别

自定义校验 分组校验 级联校验 交叉校验 类级校验 动态校验

国际化 获取条件/请求值 获取请求值 配置文件校验 返回数据校验 快速失败校验 组合校验

原理分析

# 一.前言

当提供一个接口对外提供服务时，数据校验是必须需要考虑的事情。很多时候，必须在每个单独的验证框架中实现完全相同的验证。 为了避免在每一层重新实现这些验证，许多开发人员会将验证直接捆绑到他们的类中，用复制的验证代码将它们混杂在一起。
这个JSR将为JavaBean验证定义一个元数据模型和API。

(验证数据是贯穿整个应用程序(从表示层到持久层)的常见任务。通常在每一层中实现相同的验证逻辑，这证明是费时且容易出错的。 为了避免在每一层重复这些验证，开发人员经常将验证逻辑直接捆绑到域模型中，将域类与验证代码(实际上是关于类本身的元数据)
混杂在一起。 这个JSR为JavaBean验证定义了一个元数据模型和API。默认的元数据源是注释，能够通过使用XML验证描述符覆盖和扩展元数据。 这个JSR开发的验证API不打算用于任何一层或编程模型。它特别不绑定到web层或持久性层，
并且对服务器端应用程序编程和富客户机Swing应用程序开发人员都可用。 该API被视为javabean对象模型的一般扩展，因此有望在其他规范中用作核心组件。 易用性和灵活性影响了该规范的设计。
)

# 二.为什么

统一的校验风格.业务逻辑层与数据校验层代码解耦,简化业务逻辑层代码. 使用注解简单清晰,代码易读.

# 三.怎么做

* 常规参数校验
* 自定义校验逻辑
* 任意方法参数校验
* 数据库动态校验
* 分组校验
* 交叉校验
* 原理

## 1.Valid 参数校验

Hibernate Validator 提供了 JSR 303 规范中所有内置 constraint 的实现，除此之外还有一些附加的 constraint。

JSR 303 校验框架注解类： • @NotNull 注解元素必须是非空 • @Null 注解元素必须是空 • @Digits 验证数字构成是否合法 • @Future 验证是否在当前系统时间之后 • @Past
验证是否在当前系统时间之前 • @Max 验证值是否小于等于最大指定整数值 • @Min 验证值是否大于等于最小指定整数值

• @Pattern 验证字符串是否匹配指定的正则表达式 • @Size 验证元素大小是否在指定范围内 • @DecimalMax 验证值是否小于等于最大指定小数值 • @DecimalMin 验证值是否大于等于最小指定小数值 •
@AssertTrue 被注释的元素必须为true • @AssertFalse 被注释的元素必须为false

Hibernate Validator扩展注解类：

• @Email 被注释的元素必须是电子邮箱地址 • @Length 被注释的字符串的大小必须在指定的范围内 • @NotEmpty 被注释的字符串的必须非空 • @Range 被注释的元素必须在合适的范围内

校验结果保存在BindingResult或Errors对象中

• 这两个类都位于org.springframework.validation包中 • 需校验的表单对象和其绑定结果对象或错误对象是成对出现的 • Errors接口提供了获取错误信息的方法，如getErrorCount()获取错误的数量，
getFieldErrors(String field)得到成员属性的校验错误列表 •
BindingResult接口扩展了Errors接口，以便可以使用Spring的org.springframeword.validation.Validator对数据进行校验，同时获取数据绑定结果对象的信息

```
@Data
public class UserComplex {

    @NotEmpty(message = "名字不能为空")
    @Size(min = 2, max = 6, message = "名字长度在2-6位") //字符串，集合，map限制大小
    @Length(min = 2, max = 6, message = "名字长度在2-6位")
    private String name;

    @Length(min = 3, max = 3, message = "pass 长度不为3")
    private String pass;

    @DecimalMin(value = "10", inclusive = true, message = "salary 低于10") // 被注释的元素必须是一个数字，其值必须大于等于指定的最小值
    private int salary;

    @Range(min = 5, max = 10, message = "range 不在范围内")
    private int range;

    @NotNull(message = "年龄不能为空")
    @Min(value = 18, message = "年龄不能小于18")
    @Max(value = 70, message = "年龄不能大于70")
    private int age;

    @Email
    private String email;

    @AssertTrue
    private boolean flag;

    @Past
    private Date birthday;

    @Future
    private Date expire;

    @URL(message = "url 格式不对")
    private String url;

    @AnnoValidator(value = "1,2,3")
    private String anno;
    //@Pattern(regex=,flag=)  被注释的元素必须符合指定的正则表达式

    @Size(min = 2, max = 6, message = "长度在2-6位") //字符串，集合，map限制大小
    private List<Integer> list;

}
```

## 2.Validated 参数校验

Validated是 Spring 对 Valid 的封装，是 Valid 的加强版，支持更多特性 1.只要类路径上有JSR-303实现(比如Hibernate验证器)，Bean validation 1.1支持的方法验证特性就会自动启用。
这让bean方法可以用javax进行注释。对其参数和/或返回值的验证约束。 使用这种带注释的方法的目标类需要在类型级别上使用@Validated注释进行注释，以便搜索它们的方法以找到内联约束注释。 Validated 支持对
PathVariable 参数校验，以及 RequestParam 参数校验 但是注解必须写在类上：

```
@RestController
// 注解必须写在这里,参数校验不过会有 ConstraintViolationException 异常
@Validated
public class Valid2Controller {

    @GetMapping("valid4/{data}")
    public String getPathVariable(@Size(min = 3, max = 6) @PathVariable String data) {
        return data;
    }

    @GetMapping("valid4")
    public String getRequestParam(@Size(min = 3, max = 6) @RequestParam(value = "name", defaultValue = "0") String name) {
        return name;
    }
}
```

https://www.jianshu.com/p/764eaf6c0afe

* 常规参数校验

```
class User{
    private String name;
    private String email;
    private Integer age;
    private Date birthday;
    private List<String> list;
}
```

```
User user;
if (StringUtils.isNotblank(user.getName())){
    //TODO 
}
if (user.getAge() > 0 ...){
    //TODO 
}
...
    
```

* 自定义校验逻辑


* 任意方法参数校验


* 数据库动态校验


* 分组校验 数据的创建与更新校验逻辑不同


* 交叉校验 校验密码两次输入是否相同








