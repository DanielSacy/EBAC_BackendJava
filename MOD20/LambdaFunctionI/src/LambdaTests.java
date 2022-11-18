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


    }

    private static Long calcular(Long t, Long u, BiFunction<Long,Long,Long> biFunction1) {
        return biFunction1.apply(t,u);
    }
}
