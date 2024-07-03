public class SuperKeyword {
    SuperKeyword() {
        System.out.println("constructor");
    }
    String color="white";
    void eat(){System.out.println("eating...");}

}
class Dog extends SuperKeyword{
    Dog(){
        super(); //super is used to invoke parent class constructor.
    }
    String color="black";
    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color); //super is used to refer immediate parent class instance variable.
        super.eat();   //super can be used to invoke parent class method
    }
}
class TestSuper1{
    public static void main(String args[]){
        Dog d=new Dog();
        d.printColor();
    }}