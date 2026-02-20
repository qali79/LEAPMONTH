/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package qali.leapmonth1;

/**
 *
 * @author QARAN TRAVEL
 */
import java.util.Scanner;

public class Leapmonth1{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        boolean isLeapMonth;

        isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (year % 100 != 0);
        isLeapMonth = isLeapMonth || (year % 400 == 0);

        if (isLeapMonth) {
            System.out.println(year + " is a Leap Month.");
        } else {
            System.out.println(year + " is NOT a Leap Month.");
        }
    }  
}
