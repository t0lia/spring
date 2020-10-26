#Spring examples

1. Dependency inversion and IOC container
    1. Dependency inversion from SOLID. Flow of control
    
```
  HiLvl
    | 
    v
  LoLvl
```
    
```
  HiLvl
    | 
    v
Interface
    ^
    |
  LoLvl
```

1. DI (Dependency Injection, IOC) vs Service Locator
1. Declaration: XMl, Annotation, JavaConfig. JSR-330
1. Application Context ( ClassPathXmlApplicationContext, AnnotationConfigApplicationContext)
1. Beans
    1. Names and id
    1. Scopes: singleton, prototype ...
    1. Lazy vs eager
    1. Stereotypes Component, Service, Repository

1. Dependency injection
    1. By type vs by name
    1. Constructor (required) vs Setter (optional)
    1. Cycle dependencies
    1. Several beans matching (Primary, Qualifier)
    
1. Proxy. 
    1. Cglib vs DynamicProxy. AOP
    
1. Lifecycle
    1. Create BeanDefinitions
    1. Create Beans via constructor
    1. BeforePropertiesSet BPP (no proxy)
    1. PostConstruct BPP
    1. AfterPropertiesSet (with proxy)
    1. ContextRefreshedEvent
    1. Business logic
    1. PreDestroy
    






