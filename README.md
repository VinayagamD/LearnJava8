# testjava8
Learning Java8 Features And Implementation

__Purpose of the repo is learn available methods and option in Java 8__

* Imperative vs Declarative Style Example
* About lambda
* Lambda API
    - Consumer
    - BiConsumer
    - Predicate
    - BiPredicate
    - Function
        - Min
        - Max
    - BiFunction
    - Supplier
* Stream API
    - Operation
        - Map
        - Flatmap
        - Reduce
        - Collect
        - Filter
        - Sort
        - Min
        - Max
        - Limit
        - Skip
        - allMatch
        - anyMatch
        - noneMatch
        - findAny
        - findFirst
    - Factory Methods
        - of
        - generate
        - iterate
    - Numeric Streams
        - Class to  handle primitive types
            - IntStream
            - LongStream
            - DoubleStream
        - range
        - rangeClosed
        - count
        - foreach 
        - Aggregate Functions
            - sum
            - max
            - min
            - average
            - Extra Class
                * OptionalInt   
                * OptionalLong   
                * OptionalDouble
        - Boxing & Unboxing
            - boxed
            - mapToInt
            - mapToLong
            - mapToDouble
            - mapToObj  
    - Terminal Operations
        - joining
        - counting
        - mapping
        - summingInt
        - averagingInt
        - summingLong
        - averagingLong
        - summingDouble
        - averagingDouble
        - maxBy
        - minBy
        - groupingBy
        - partitioningBy 
    - Parallel Processing
        - sequential vs parallel
        - when not to use parallel stream
            * boxed
* Optional
    - isPresent
    - get
    - ofNullable
    - empty
    - orElse
    - orElseGet
    - orElseThrow
    - ifPresent
    - map
    - flatMap
    - filter
* Default & Static Method
    - Interface
        - Default Method (default)
        - Static Method
        - Multiple Inheritance
        - Resolving Multiple Inheritance Issue
    - Abstract vs Interface
* Date & Time Libraries  [_Joda DateTime Insipiration_] : https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html
    - LocalDate
        - Creation
            - now
            - of
            - ChronoField
            - ChronoUnit
            - TemporalAdjusters
        - Accessing
            - getMonth
            - getMonthValue
            - getYear
            - getDayOfMonth
            - getDayOfYear
        - Modifying
            - plusDays
            - plusMonths
            - plusYears
            - minusDays
            - minusMonths
            - minusYears
            - with
        - Validation   
            - isEqual
            - isBefore
            - isAfter
            - isSupported
            - isLeapYear
    - LocalTime
        - **All functionality same as LocalDate except date related**
        - Accessing
            - getHour
            - getMinute
            - getNanoOfSecond
            - toSecondOfDay -> represents time in seconds
        - Modifying
             - minusHours
    - LocalDateTime
        - **All functionality same as LocalDate and LocalTime**
      
    - Period -> Only comaptible with LocalDate

    
    
__Java 8__

![Java8](https://cms-assets.tutsplus.com/uploads/users/369/posts/29661/preview_image/java-8-for-android-setting-up-lambda-expressions.png)

__Lambda Expression__\
![Lambda](https://topjavatutorial.com/wp-content/uploads/2015/10/lambda-expression.png?8bc116&8bc116)

__Lambda Example__\
![Lambda Example](https://cdn-images-1.medium.com/max/1600/1*UxWvpW98lDKAYy3rzKZJQA.png)

__Stream Api__\
![Stream Api](https://www.logicbig.com/tutorials/core-java-tutorial/java-util-stream/images/java-streams.png) 

__Trained From Udemy__\
![Udemy](https://www.udemy.com/staticx/udemy/images/v6/logo-coral.svg)

Udemy: https://www.udemy.com/ \
Tutorial Link:https://www.udemy.com/modern-java-learn-java-8-features-by-coding-it/learn/v4/overview \
JDK 8: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
