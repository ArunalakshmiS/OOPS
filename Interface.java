interface Printable { void print(); }
class Document implements Printable {
    public void print(){System.out.println("Printing document");}
}
public class Interface {
    public static void main(String[] args){new Document().print();}
}
