package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double result = Calculator.excute(input);
        System.out.println(input + " = " + result);
    }
}
