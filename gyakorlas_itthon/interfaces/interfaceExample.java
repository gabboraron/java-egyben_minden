public interface MyInterface {

    public String hello = "Hello";

    public void sayHello();
}

//print it: 
//System.out.println(MyInterface.hello);

public class MyInterfaceImpl implements MyInterface {

    public void sayHello() {
        System.out.println(MyInterface.hello);
    }
}

//MyInterface myInterface = new MyInterfaceImpl();

//myInterface.sayHello();

public class MyInterfaceImpl
    implements MyInterface, MyOtherInterface {

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayGoodbye() {
        System.out.println("Goodbye");
    }
}