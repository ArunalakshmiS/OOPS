abstract class Shape { abstract void area(); }
class Circle extends Shape {
    double r=5;
    void area(){System.out.println(Math.PI*r*r);}
}
public class AbstractClass {
    public static void main(String[] args){new Circle().area();}
}
