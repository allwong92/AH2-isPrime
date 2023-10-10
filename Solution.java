public class Solution {
    public boolean isPrime(int num){
        /*
        This method returns a boolean saying whether the given number is prime.
         */

        int checkTo = num/2; // number we need to check to for possible factors of num
        // square root works here too!

        boolean prime = true; // assume that num is prime

        if (num == 0 || num == 1){ // 0 and 1 are special because they're not prime
                                    // but won't go through for loop below
            prime = false;
        }

        for (int i=2; i<= checkTo; i++) {
            if (num % i == 0) { // found a factor (num is divisible by something)
                prime = false; // change prime to false because num divisible
                break;
            }
        }

        return prime;
    }

}
