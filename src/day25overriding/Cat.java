package day25overriding;
/*
    1)Access modifier of the "Overriding Method" (The method inside the child class) CANNOT be narrower (can be same or wider)
    than the access modifier of the "Overridden Method"(The method inside the parent class)
        "Overridden Method"         "Overriding Method"
             public                     public
             protected                  protected-public
           **private                    private methods can not be overridden
           **defaut                     default -protected -public (If you are not in the same package defaults methods can not be overridden

     2)Return Types must have "IS-A" Relationship from "Overriding Method"(child) "Overridden Method"(parent)
       Note: To have "IS-A" relationship we must have "parent-child" relationship
            If Java or you did not create "parent-child" relationship between classes you can not have "IS-A" relationship,
            therefore you can not use different return types in overriding
       Note: Java did not create "parent-child" relationship between "wrapper classes" because of that if return type is one of the
            wrapper class return type of "overriding method" must be the same with the return type of the "Overridden Method"
       Note: If the return type is "primitive", you can not change the return type in overriding
       Note: If the return type is "void", you can not change the return type in overriding

    3)You can not update "method name " and "method parameters" in overriding under any condition
        Note:"method name" and " method parameters" are the "signature of the method"(method signature)
            If you change anyone of "method name" and "method parameters", it means you created a new method but in overriding
            we should not create a new method we should just change the implementation

    4) "static methods" are common for all objects, if you uverride and change the implementation all other objects will be affected from the update
        but that can create many issues because of that Java does not let to override static methods

    5)"final method" body is the last updated body, you can not change the body
        But we change the body in overriding, this is contradiction because of that
        Java does not let to override "final methods"

     6) What is the difference between "Method Overloading" and "Method Overriding"?
     i) "Method overloading" is done in a single class but "Method overriding" neew multiple classes with "paren-child relationship"(inheritance)
     ii) In "Method Overloading", we change the method signature, but in "Method Overriding" we do not touch the method signature
     iii) private,static, and final methods can not be    overridden but can be overloaded
     Note: "Method Overloading"(static polymorphism) + "Method Overriding"(dynamic polymorphism) = "Polymorphism"
 */
public class Cat extends Mammal{
    @Override
    public void drink() {
        System.out.println("Cats drink");
    }

    @Override
    public void feedBabyWithMilk() {
        System.out.println("Cats feed their baby by milk");
    }

    public void meow() {
        System.out.println("Cats meow");
    }




}
