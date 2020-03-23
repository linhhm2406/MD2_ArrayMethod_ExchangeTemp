import java.util.Scanner;

public class CelsiusAndFahrenheit {
    public static double celsius(double celsius) {
        return (celsius * 9 / 5.0) + 32;
    }

    public static double fahrenheit(double fahrenheit) {
        return (fahrenheit - 32) * (5.0 / 9);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu\n" +
                "1. Fahrenheit to Celsius\n" +
                "2. Celsius to Fahrenheit\n" +
                "0. Exit");
        System.out.print("Nhap vao lua chon: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1: {
                System.out.print("Nhap vao so oF: ");
                double F = input.nextDouble();
                System.out.printf("%-5.1foF = %-5.1foC", F, fahrenheit(F));
                break;
            }
            case 2: {
                System.out.print("Nhap vao so oC: ");
                double C = input.nextDouble();
                System.out.printf("%-5.1foC = %-5.1foF", C, celsius(C));
                break;
            }
            case 0:{
                System.out.println("No choice");
            }
        }
    }
}
