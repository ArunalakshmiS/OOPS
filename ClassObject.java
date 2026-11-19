class Student {
    String name; int age;
    Student(String name,int age){this.name=name;this.age=age;}
    void display(){System.out.println(name+" "+age);}
}
public class ClassObject {
    public static void main(String[] args){new Student("Aruna",21).display();}
}
