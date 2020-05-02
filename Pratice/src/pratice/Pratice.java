package pratice;

import java.util.Scanner;

/**
 *
 * @author 15142
 */
public class Pratice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student one = new Student("Po", 123456, 3.6);
        Student two = new Student("Pipi", 8976, 9.7);

//        one.setSecurNum(89438);
//        System.out.println("The student's security number is " + one.getSecurNum());
        Scanner oop = new Scanner(System.in);
        System.out.println("Please input security num");
        int num = oop.nextInt();

        one.setSecurNum(num);
        System.out.println("ecurity num is " + one.getSecurNum());

        System.out.println("Is student one and two the same person? " + one.equals(two));

    }

}

class Student {

    private String name;
    private int securityNum;
    private double gpa;

    public Student(String n, int s, double g) {
        name = n;
        securityNum = s;
        gpa = g;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecurNum(int securityNum) {
        this.securityNum = securityNum;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getSecurNum() {
        return securityNum;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student Name: " + name
                + "Student Security Number " + securityNum
                + "Student GPA " + gpa;
    }

    public boolean equals(Student copy) {
        return securityNum == copy.securityNum;

    }
}
