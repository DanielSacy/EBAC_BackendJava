package Reflections;

import java.lang.reflect.*;

public class AppReflections {
    public static void main(String[] args) {
        Class classe = Product.class;
        System.out.println(classe);

        try {
            Constructor construtor = classe.getConstructor(null);
            Product produto = (Product) construtor.newInstance();
            System.out.println(produto);
            
            Field[] fields = produto.getClass().getDeclaredFields();
            for(Field field : fields) {
            System.out.println(field.toString());
            }
            
            Method[] metodos = produto.getClass().getMethods();
            for(Method metodo : metodos) {
                Class<?> type = metodo.getReturnType();
                String name = metodo.getName();
            System.out.println(type);
            System.out.println(name);
            }

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
