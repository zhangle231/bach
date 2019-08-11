# thymes

## Texts
使用字符串，如下方式：
```
<p th:text="#{home.welcome}">Welcome to our grocery store!</p>
```
以下接口和类用于实现字符串显示：
```
org.thymeleaf.messageresolver.IMessageResolver
org.thymeleaf.messageresolver.StandardMessageResolver
```
MessageSourceProperties类中包括默认的basename,message.
```
MessageSourceProperties
```
html可以使用utext来显示
```
<p th:utext="#{home.welcome}">Welcome to our grocery store!</p>
```
使用变量
```html
<p>Today is: <span th:text="${test}">13 February 2011</span></p>
```
## 表达式
表达式列表
```
Simple expressions:
Variable Expressions: ${...}
Selection Variable Expressions: *{...}
Message Expressions: #{...}
Link URL Expressions: @{...}
Fragment Expressions: ~{...}
Literals
Text literals: 'one text', 'Another one!',…
Number literals: 0, 34, 3.0, 12.3,…
Boolean literals: true, false
Null literal: null
Literal tokens: one, sometext, main,…
Text operations:
String concatenation: +
Literal substitutions: |The name is ${name}|
Arithmetic operations:
Binary operators: +, -, *, /, %
Minus sign (unary operator): -
Boolean operations:
Binary operators: and, or
Boolean negation (unary operator): !, not
Comparisons and equality:
Comparators: >, <, >=, <= (gt, lt, ge, le)
Equality operators: ==, != (eq, ne)
Conditional operators:
If-then: (if) ? (then)
If-then-else: (if) ? (then) : (else)
Default: (value) ?: (defaultvalue)
Special tokens:
No-Operation: _
```
{}可以在text中插入变量
内置变量
```
#ctx: the context object.
#vars: the context variables.
#locale: the context locale.
#request: (only in Web Contexts) the HttpServletRequest object.
#response: (only in Web Contexts) the HttpServletResponse object.
#session: (only in Web Contexts) the HttpSession object.
#servletContext: (only in Web Contexts) the ServletContext object.
```
另一些变量
```
#execInfo: information about the template being processed.
#messages: methods for obtaining externalized messages inside variables expressions, in the same way as they would be obtained using #{…} syntax.
#uris: methods for escaping parts of URLs/URIs
#conversions: methods for executing the configured conversion service (if any).
#dates: methods for java.util.Date objects: formatting, component extraction, etc.
#calendars: analogous to #dates, but for java.util.Calendar objects.
#numbers: methods for formatting numeric objects.
#strings: methods for String objects: contains, startsWith, prepending/appending, etc.
#objects: methods for objects in general.
#bools: methods for boolean evaluation.
#arrays: methods for arrays.
#lists: methods for lists.
#sets: methods for sets.
#maps: methods for maps.
#aggregates: methods for creating aggregates on arrays or collections.
#ids: methods for dealing with id attributes that might be repeated (for example, as a result of an iteration).
```
## Link URLs
html用法
```
<a href="details.html"
   th:href="@{http://localhost:8080/gtvg/order/details(orderId=${test})}">view</a>
<a href="details.html" th:href="@{/order/details(orderId=${test})}">view</a>
<a href="details.html" th:href="@{/order/{orderId}/details(orderId=${test})}">view</a>
```

## Literals
| 连接字符串
```
<span th:text="|Welcome to our application, ${test}!|">
```

## 4.10 Comparators and Equality
