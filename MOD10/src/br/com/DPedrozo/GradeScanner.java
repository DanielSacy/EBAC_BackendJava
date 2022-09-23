package br.com.DPedrozo;

import java.util.Scanner;

/**
 * @created 22/09/2022 - 4:35 PM
 * @project MOD10
 * Author Daniel Pedrozo
 */
public class GradeScanner {
    public int gradeScanner() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a nota: ");
        int value = s.nextInt();
        return value;
    }
}
