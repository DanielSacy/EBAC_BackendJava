package br.com.DPedrozo;

/**
 * @created 22/09/2022 - 4:33 PM
 * @project MOD10
 * Author Daniel Pedrozo
 */
public class StudentGrades {
    GradeScanner grade = new GradeScanner();
    public int grade1;
    public int grade2;
    public int grade3;
    public int grade4;

//    public void setGrade1(int grade1) {
//        this.grade1 = grade.gradeScanner();
//    }
//    public void setGrade2(int grade2) {
//        this.grade2 = grade.gradeScanner();
//    }
//    public void setGrade3(int grade3) {
//        this.grade3 = grade.gradeScanner();
//    }
//    public void setGrade4(int grade4) {
//        this.grade1 = grade.gradeScanner();
//    }
    public int studentAVG(int grade1, int grade2, int grade3, int grade4) {
       int result =  (grade1 + grade2 + grade3 + grade4) / 4;
//       System.out.println(result);
       return result;
    }
}
