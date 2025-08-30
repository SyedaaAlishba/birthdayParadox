package app;

import birthday_paradox.BirthdayParadox;

public class Program {
    public void run(){
        BirthdayParadox bd= new BirthdayParadox();
        int numPeople = bd.takeInput();   // number of persons
        int trials = bd.inputTrial();     // number of trials
        bd.runOneTrial(numPeople);
        int successCount = 0;
        for (int t = 0; t < trials; t++) {
            if (bd.runOneTrial(numPeople)) {
                successCount++;
            }
        }
        double probability = (double) successCount / trials;
        System.out.println("Estimated probability with " + numPeople +
                " people: " + probability);
    }
}
