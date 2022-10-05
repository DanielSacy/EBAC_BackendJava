public class Bubblesort {
    public static void main(String[] args) {
        int[] array = {8,5,9,2,3,1,4,6};
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
}