import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {

        // Convert array to a single string
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            strBuilder.append(digits[i]);
        }

        // Accessing contents of the stringBuilder and later converting them to BigInteger called number and adding one
        String newString = strBuilder.toString();
        BigInteger number = new BigInteger(newString).add(BigInteger.ONE);

       
      
        //convert back the result to an array
        String resultString = number.toString();
        digits = new int[resultString.length()];
        for (int i = 0; i < resultString.length(); i++) {
            digits[i] = resultString.charAt(i) - '0';
        }

        return digits;
    }
}

//https://leetcode.com/problems/plus-one/solutions/3133405/simple-methodical-way-in-java/

