# Backend Component - Basic Contract

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/ec0be628558f452baa30086fc5553c64)](https://app.codacy.com/manual/codimiracle/basic-contract?utm_source=github.com&utm_medium=referral&utm_content=codimiracle/basic-contract&utm_campaign=Badge_Grade_Dashboard)
[![Build Status](https://travis-ci.org/codimiracle/basic-contract.svg?branch=master)](https://travis-ci.org/codimiracle/basic-contract)
[![Codecov Badge](https://codecov.io/gh/codimiracle/basic-contract/badge.svg)](https://codecov.io/gh/codimiracle/basic-contract)
	
basic-contract is a simple controller reuse component.
includes some reusable abstract for using in controller such as Page, PageSlice, Filter and Sorter.

## Feature
Provided class as follows:
  * Page
        
       indicates page limit and size
  * PageSlice
       
       indicates page slice for specified `Page`
  * Filter
       
       indicates how to filter database row
       
  * Sorter
        
       sorting data for database query result
  * ApiResponse
  
       return any unified response for web api
  * FilterConverter
  
       convert string to `Filter` object
  * SorterConverter
  
       conver string to `Sorter` object 
 
## Installation
### Maven
snapshot is uploaded.
```xml
<dependency>
    <groupId>com.codimiracle.web</groupId>
    <artifactId>basic-contract</artifactId>
    <version>1.0.1-SNAPSHOT</version>
</dependency>
```
## Usages
Simply, you can use in everywhere, but those is design for spring boot controller layer. you can use those class like:
```java
// in ExampleController.java
public ApiResponse query(Filter filter, Sorter sorter, @ModelAttribute Page page) {
    //...listing example
    PageSlice slice = null; 
    return new ApiResponse(0, "success", slice);
}
```
## See also
[mybatis-contract](https://github.com/codimiracle/mybatis-contract)
