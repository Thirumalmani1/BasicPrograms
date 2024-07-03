package javaEight;


interface TestInterface
{
    // abstract method
    public void square (int a);

    // static method
    static void show()
    {
        System.out.println("Static Method Executed");
    }
    // default method
    default void showDeFault()
    {
        System.out.println("Default Method Executed");
    }
}


public class DefaultAndStaticMethod implements TestInterface {

    @Override
    public void square(int a) {
        System.out.println("Square of "+a+" is "+(a*a));
    }

    public static void main(String[] args) {
        TestInterface.show();
        DefaultAndStaticMethod obj = new DefaultAndStaticMethod();
        obj.square(5);
        obj.showDeFault();
        TestInterface.show();
    }
}
