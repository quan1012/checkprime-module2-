package Vonglap;

import java.util.Scanner;

public class Checkprime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number<2){
            System.out.println("is not a prime");
        } else {
            boolean check = true;
            for (int i = 2; i<Math.sqrt(number);i++){
                if (number %i==0){
                    check = false;
                    break;
                }
            }
            if (check)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");
        }
    }
}
