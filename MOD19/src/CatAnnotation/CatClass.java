package CatAnnotation;

@VeryImportantCatAnnotation
public class CatClass {

    @ImportantCatString
    String name;
    int age;

    public CatClass(String name) {
        this.name = name;
    }

    @RunImmediately(times = 3)
    public void meow() {
        System.out.println("Meow!");
    }
    
    public void eat() {
        System.out.println("Munch!");
    }
    
}
