package br.com.DPedrozo;

import java.util.Scanner;

/**
 * @created 22/09/2022 - 11:50 AM
 * @project MOD10
 * Author Daniel Pedrozo
 */
public class ControleFLuxo {
    public static void main(String args[]) {
        StudentGrades student = new StudentGrades();
        GradeScanner value = new GradeScanner();
        
        int grade1 = value.gradeScanner();
        int grade2 = value.gradeScanner();
        int grade3 = value.gradeScanner();
        int grade4 = value.gradeScanner();

        System.out.println(student.studentAVG(grade1, grade2, grade3, grade4));

//        int studentAvg = student.studentAVG();
//        int studentPrint = student.printAvg(result);


    }
}
