package Annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented  // To appear in Javadoc
@Retention(RetentionPolicy.RUNTIME)  // To appear in execution time
@Target({ElementType.TYPE,ElementType.FIELD})
public @interface FirstAnnotation {
    String value();

    String[] bairros();

    long numeroCasa();

    double valores() default 5d;
}
