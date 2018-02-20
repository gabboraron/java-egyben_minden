package roo;

public class Kangaroo {
    private String name = "";
    private int age = 0;
    
    public Kangaroo(String name, int age) {
        this.name = name; 
        this.age = age;
    }

    public Kangaroo(int legs){
        System.out.println("A kengurunak " + legs + " laba van.");
    }
    //konstruktornak nem lehet visszatérési értéke
    
    public void display(String country){
        System.out.println( "A kenguru neve: " + name + ", lakohelye: " + country );	
        age++;
        System.out.println(  "A kenguru kora: " + age);
    }
}
