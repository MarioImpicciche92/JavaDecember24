package intermediate;

import java.util.Random;

public class array {
    public static void main(String[] args) {
        int lottery[] = new int[5];
        Random randomGenerator = new Random();

        lottery[0] = (int) (Math.random() * 15);
        lottery[1] = randomGenerator.nextInt(80);
        lottery[2] = 54;
        lottery[3] = 87;
        lottery[4] = 89;

        for (int i = 0; i < lottery.length; i++) {
            System.err.println(lottery[i]);
        }

    }

}
