package marks;

import java.util.Scanner;

public class GradeCalculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of subjects");
		int subject = sc.nextInt();
		
		int marks = 0,total = 0;
		boolean fail = false;
		for(int i=1;i<=subject;i++) {
			System.out.println("Enter the marks as per subject: "+i);
			while(marks <0 || marks >100) {
				System.out.println("Invalide Marks ... Please enter thr marks between 0 to 100");
			 }
			
			marks = sc.nextInt(); if (marks < 40) {
                fail = true;
            }
            total += marks;
        }

        if (fail) {
            System.out.println("\nRESULTS:");
            System.out.println("Total Marks: " + total);
            System.out.println("Grade: Fail");
        } else {
            double averagePercentage = (double) total / subject;

            System.out.println("\nRESULTS:");
            System.out.println("Total Marks: " + total);
            System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);

            String grade = calculateGrade(averagePercentage);
            System.out.println("Grade: " + grade);
        }

        sc.close();
    }

    public static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B+";
        } else if (averagePercentage >= 60) {
            return "B";
        } else if (averagePercentage >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}
