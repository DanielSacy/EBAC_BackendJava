package JohnLambda;

public class Cat implements IPrintable {
    public String name;
    public int age;

    public Cat(){}

    @Override
    public void print() {
        System.out.println("Meow");
        
    }
}
