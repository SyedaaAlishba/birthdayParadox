package randomGenerator;

import java.util.ArrayList;

public class RandomNumber {
    public RandomNumber(int n, ArrayList<Integer> birthDays) {
        for (int i = 0; i < n; i++) {
            int random = (int) (Math.random() * 365) + 1; //randomly generated birthdays (1-365)
             //add in list
            birthDays.add(random);
        }
    }
}
