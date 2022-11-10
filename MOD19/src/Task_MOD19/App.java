package Task_MOD19;


public class App {
    public static void main(String[] args) {
        TableAnnotated table = new TableAnnotated();
        if(table.getClass().isAnnotationPresent(TableAnnotation.class)){
            String name = table.getClass().getSimpleName();
            System.out.println(name);
        }
    }
}
