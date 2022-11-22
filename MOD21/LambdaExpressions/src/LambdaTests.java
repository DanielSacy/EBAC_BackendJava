import java.util.function.*;

public class LambdaTests {
    public static void main(String[] args) {
        IntBinaryOperator intBinaryOperator = (int a, int b) -> {
            return a + b;
        };

        System.out.println(intBinaryOperator.applyAsInt(2, 2));

        BiFunction<Integer,Integer,Integer>  biFunction = (Integer a, Integer b) -> {
            return a + b;
        };
        System.out.println(biFunction.apply(2, 2));

        Long result = calcular(10l, 5l, (Long v1, Long v2) -> {
            return v1+v2;
        });
        System.out.println(result);

        System.out.println();

        Runnable hello = () -> {
            System.out.println("Hello World!");
        };
        
        Consumer<String> sConsumer = (String s) -> {
            System.out.println(s);
        };
        sConsumer.accept("Feito!");

        Supplier<Integer> intNumber = () -> 42;
        Supplier<Double> douNumber = () -> {
            return 3.14;
        };

        Runnable threadLambda = () -> System.out.println("Testing threads");
        new Thread(threadLambda).start();
        
        new Thread(() -> System.out.println("Testing threads inline")).start();

    }

    private static Long calcular(Long t, Long u, BiFunction<Long,Long,Long> biFunction1) {
        return biFunction1.apply(t,u);
    }
}
