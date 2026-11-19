class Animal { void sound(){System.out.println("Animal");} }
class Cat extends Animal { void sound(){System.out.println("Meow");} }
class Cow extends Animal { void sound(){System.out.println("Moo");} }
public class Polymorphism {
    public static void main(String[] args){
        Animal a=new Cat(); a.sound();
        a=new Cow(); a.sound();
    }
}
