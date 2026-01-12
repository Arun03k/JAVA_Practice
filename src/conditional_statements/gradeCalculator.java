package conditional_statements;

import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks from 0 - 100");
        int grade = sc.nextInt();
        sc.close();
        if ((grade > 100 || grade < 0)) {
            System.out.println("Input InValid");
        }
        else if(grade >= 90 && grade<=100){
            System.out.println("Your marks are : " + grade + " Your grade is A ");
        }
        else if(grade >= 80 && grade<=89){
            System.out.println("Your marks are : " + grade + " Your grade is B ");
        }
        else if(grade >= 70 && grade<=79){
            System.out.println("Your marks are : " + grade + " Your grade is C ");
        }
        else if(grade >= 60 && grade<=69){
            System.out.println("Your marks are : " + grade + " Your grade is D ");
        }
        else{
            System.out.println("Your marks are : " + grade + " Your grade is F ");
        }
    }
}
