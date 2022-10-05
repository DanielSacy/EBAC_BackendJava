import java.util.Scanner;

public class BubblesortConsole {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.println("Type numbers divided by commas: ");
        String digits = info.nextLine();
        String[] digitsStr = digits.split(",");

        int[] array = convert(digitsStr);
        int aux = 0;
        int i = 0;
        
        System.out.println("Array desordenado: ");
        for(i = 0; i < array.length; i++ ) {
            System.out.println(" " + array[i]);
        }

        System.out.println("INTERLÚDIO\n");

        for(i=0; i<array.length; i++) {
            for(int j=0; j < array.length - 1; j++ ) {
                if(array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }

            }
        }
        System.out.println("Array sorted: ");
        for(i=0; i<array.length; i++){
            System.out.println(" " + array[i]);
        }
    }

    private static int[] convert(String[] digitsStr) {
        int[] array = new int[digitsStr.length];
        for(int i = 0; i < digitsStr.length; i++) {
            array[i] = Integer.parseInt(digitsStr[i]);
        }
        return array;
    }
}