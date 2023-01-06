package Vonglap;

import java.util.Scanner;

public class interestcalculator {
    public static void main(String[] args) {
        double monney = 1.0;
        int month = 1 ;
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tiền gửi");
        monney = scanner.nextDouble();
        System.out.println("Số tháng gửi");
        month = scanner.nextInt();
        System.out.println("Lãi suất");
        interestRate = scanner.nextDouble();
        double tottalInterest = 0;
        for (int i = 0 ; i<month;i++){
            tottalInterest += monney * (interestRate/100)/12 * month;
        }
        System.out.println("Lãi nhận được là : " + tottalInterest);
    }
}
