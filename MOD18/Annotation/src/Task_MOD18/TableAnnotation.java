package Task_MOD18;

import java.lang.annotation.*;

@Documented  // To appear in Javadoc
@Retention(RetentionPolicy.RUNTIME)  // To appear in execution time
@Target({ElementType.TYPE,ElementType.FIELD})
public @interface TableAnnotation {
    String value();    
}
