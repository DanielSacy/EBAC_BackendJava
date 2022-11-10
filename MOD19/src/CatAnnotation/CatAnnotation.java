package CatAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CatAnnotation {
    public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        @SuppressWarnings("unused")
        CatClass myCat = new CatClass("FurBall");
        DogClass myDog = new DogClass("Sniffer");


        if(myCat.getClass().isAnnotationPresent(VeryImportantCatAnnotation.class)) {
            System.out.println("Wow! This is very important!");
        }else {
        System.out.println("Nah! This is NOT very important!");
        }
        
        if(myDog.getClass().isAnnotationPresent(VeryImportantCatAnnotation.class)) {
            System.out.println("Wow! This is very important!");
        }else {
        System.out.println("Nah! This is NOT very important!");
        }

        for(Method method : myCat.getClass().getDeclaredMethods()) {
            if(method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately runAnnotation = method.getAnnotation(RunImmediately.class);
                for(int i =0; i < runAnnotation.times(); i++) {
                method.invoke(myCat);
                }
            }
        }

        for( Field field : myCat.getClass().getDeclaredFields()) {
            if(field.isAnnotationPresent(ImportantCatString.class)) {
                System.out.println(((String) field.get(myCat)).toUpperCase());
            }
        }


    }
}