public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return (t1 + t2 + t3 + t4) / 4;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int) (average + 0.5);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        if (roundedAverage >= 65) {
            return true;
        } else {
            return false;
        }
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return shares * price;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        if (totalStock < 0) {
            return (int) (totalStock - 0.5);
        } else {
            return (int) (totalStock + 0.5);
        }
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        userDouble *= 100;
        int hundreds = (int) userDouble / 10000;
        int tens = (int) userDouble % 10000 / 1000;
        int ones = (int) userDouble % 1000 / 100;
        int tenths = (int) userDouble % 100 / 10;
        int hundredths = (int) userDouble % 10;

        hundreds = hundreds % 10;
        tens = (tens + 1) % 10;
        ones = (ones + 1) % 10;
        tenths = (tenths + 1) % 10;
        hundredths = (hundredths + 1) % 10;


        return (hundreds * 10000 + tens * 1000 + ones * 100 + tenths * 10 + hundredths) / 100.0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(12.90));
        //23.01
    }

}
