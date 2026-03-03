1. Design Choices for EarlyBirdDiscountService
a.Well,I have used interface which keeps method that returns String and has 2 localtime values as parameters. 
Then,EarlyBirdsDiscountClass implements that interface and overrides its method and adds logic that tells us how to book according to those dates.
Also checks its validation.
b.In config, I have Bean that will work only when the condition in application.Property will be true then it will create earlybirds implementation object.
c.Then, controller Which takes interface spring boot understands that it is implemented by earlybirdDIcountIMple class so treats it as object checks whether it si null or not and then returns.it

2.Why Constructor-Based Dependency Injection Was Chosen
a. It allows the injected fields to be marked final, improving immutability.
b.It makes the code easier to test without relying on the Spring itself.
3.Application Behavior When Early Bird Feature Is Disabled
a.If feature.earlybird.enabled=false or the property is missing, the EarlyBirdDiscountService bean is not created in the Spring ApplicationContext.