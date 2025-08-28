package birthday_paradox;

import java.util.ArrayList;
import java.util.Scanner;

public class BirthdayParadox {
    int date;
    ArrayList<Integer> birthDays= new ArrayList<>();
    Scanner sc= new Scanner(System.in);

    //this function is responsible for taking birthdays
    public void takeInput(){
        System.out.println("Enter the number of dates you gonna enter "); //like 3 dates if you are entering 12,3,9
        int num= sc.nextInt();
        if(num>0){
            for (int i = 0; i < num; i++) {
                date= sc.nextInt();
                birthDays.add(date);
            }
        }
    }




}
