package statements;

import java.util.Scanner;

public class DaysofWeek {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number of the day  ");
        int day=sc.nextInt();


        if (day ==1){
            System.out.println("Monday");
        }else if (day == 2){
            System.out.println("Tuesday");
        }else if (day ==3){
            System.out.println("Wednsday");

        }else{
            System.out.println("Day's not valid");
        }

    }
}
