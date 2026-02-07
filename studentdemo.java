package studentinfo1;

import java.util.Scanner;

public class studentdemo {

    private int rollNo;
    private String name;
    private int[] marks;
    private double average;
    private char grade;

    public studentdemo(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    
    private void calculateAverage() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        average = sum / (double) marks.length;
    }
    private void calculateGrade() {
        if (average >= 80)
            grade = 'A';
        else if (average >= 60)
            grade = 'B';
        else
            grade = 'C';
    }

  
    public void displayResult() {
        calculateAverage();   
        calculateGrade();     

        System.out.println("\nStudent Result");
        System.out.println("Name   : " + name);
        System.out.println("RollNo : " + rollNo);
        System.out.println("Average: " + average);
        System.out.println("Grade  : " + grade);
    }

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        studentdemo[] students = new studentdemo[n];

        for (int i = 0; i < n; i++) {

            sc.nextLine(); 
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();

            int[] marks = new int[5];
            System.out.println("Enter marks of 5 subjects:");
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }

           
            students[i] = new studentdemo(roll, name, marks);
        }

        
        for (int i = 0; i < n; i++) {
            students[i].displayResult();
        }

        sc.close();
    }
}
