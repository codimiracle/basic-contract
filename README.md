# Backend Component
basic-contract is a simple controller reuse component.
includes some reusable abstract for using in controller such as Page, PageSlice, Filter and Sorter.

# Feature
Provided class as follows:
* Page
* PageSlice
* Filter
* Sorter
* ApiResponse
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
