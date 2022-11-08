package Exception;

public class DemoThrow {
    public static void main(String args[]) {
        exception();
        runTimeException();
    }

    private static void runTimeException() {
        ExemploThrow.saqueRunTimeException(500);
    }

    private static void exception() {
        try {
            ExemploThrow.saque(500);
        } catch (LimiteSaqueException e) {
            System.out.println("ERRO " + e.getMessage());
        }
    }
}
