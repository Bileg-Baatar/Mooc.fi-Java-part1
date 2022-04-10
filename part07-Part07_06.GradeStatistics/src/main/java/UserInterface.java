
import java.util.Scanner;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bileg
 */
public class UserInterface {

    private Scanner input;
    private int sum;
    private int numberOfPoints;
    private int passing;
    private int numOfPassing;
    private ArrayList<Integer> points;

    public UserInterface(Scanner input) {
        this.input = input;
        this.sum = 0;
        this.numberOfPoints = 0;
        this.passing = 0;
        this.numOfPassing = 0;
        this.points = new ArrayList<>();
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {

            int numbers = Integer.valueOf(this.input.nextLine());

            if (numbers == -1) {
                break;
            }
            if (numbers >= 0 && numbers <= 100) {
                this.points.add(numbers);
                sum += numbers;
                numberOfPoints++;
                if (numbers >= 50) {
                    passing += numbers;
                    numOfPassing++;
                }

            }

        }
        pointAvg();
        passingGrade();
        GradeDis(this.points);
    }

    public void pointAvg() {
        double avg = 1.0 * this.sum / this.numberOfPoints;

        System.out.println("Point average (all): " + avg);
    }

    public void passingGrade() {
        System.out.println("Point average (passing): " + 1.0 * this.passing / this.numOfPassing);
        System.out.println("Pass percentage: " + 1.0 * 100 * this.numOfPassing / this.numberOfPoints);
    }

    public void GradeDis(ArrayList<Integer> a) {
        String[] grade = new String[6];
        for (int i = 0; i < grade.length; i++) {
            grade[i] = "";
        }
        int count = 0;
        for (int i : a) {
            if (i < 50) {
                grade[0] += "*";
            }
            if (i >= 50 && i < 60) {
                grade[1] += "*";
            }
            if (i >= 60 && i < 70) {
                grade[2] += "*";
            }
            if (i >= 70 && i < 80) {
                grade[3] += "*";
            }
            if (i >= 80 && i < 90) {
                grade[4] += "*";
            }
            if (i >= 90) {
                grade[5] += "*";
            }

        }
        System.out.println("Grade distribution:");
        for (int i = grade.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + grade[i]);
        }
    }
}
