package roo;

public class Kangaroo {
    public String name = "";
    public int age = 0;
    
    public void Kangaroo(String name, int age) {
        name = this.name; 
        age = this.age;
    }

    /*public void Kangaroo(int age) {
        this(Kangaroo("XY",this.age));
    }*/
    
    public void Kangaroo(int legs){
        System.out.println("A kengurunak " + legs + " laba van.");
    }
    //konstruktornak nem lehet visszatérési értéke
    
    public void display(String country){
        System.out.println( "A kenguru neve: " + name + ", lakohelye: " + country );	
        System.out.println(  "A kenguru kora: " + age++);
    }
}