/**
 * @created 22/09/2022 - 11:18 AM
 * @project MOD09
 * Author Daniel Pedrozo
 */
public class TaskCasting {
    public static void main(String[] args) {
        String str = args[0];
        int numP = Integer.parseInt(str);
        long numWrapped = numP;
        System.out.println("Wrapped (int)numP = (long)numWrapped as: " + numWrapped);
    }
}
