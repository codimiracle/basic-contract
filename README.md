# Backend Component
basic-contract is a simple controller reuse component.
includes some reusable abstract for using in controller such as Page, PageSlice, Filter and Sorter.

![Java CI with Maven](https://github.com/codimiracle/basic-contract/workflows/Java%20CI%20with%20Maven/badge.svg)

# Feature
Provided class as follows:
* Page
* PageSlice
* Filter
* Sorter
* ApiResponse
# Install
## Maven
snapshot is uploaded.
```xml
<dependency>
    <groupId>com.codimiracle.web</groupId>
    <artifactId>basic-contract</artifactId>
    <version>1.0.1-SNAPSHOT</version>
</dependency>
```
# Usage
Simply, you can use in everywhere, but those is design for spring boot controller layer. you can use those class like:
```java
// in ExampleController.java
public ApiResponse query(Filter filter, Sorter sorter, @ModelAttribute Page page) {
    //...listing example
    PageSlice slice = null; 
    return new ApiResponse(0, "success", slice);
}
```
# See also
[mybatis-contract](https://github.com/codimiracle/mybatis-contract)
