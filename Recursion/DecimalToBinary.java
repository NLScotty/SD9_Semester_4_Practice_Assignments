package Recursion;

public class DecimalToBinary {
    public static String decimalToBinary(int decNumber){
        if(decNumber == 0){
            return "0";
        }
        else if(decNumber == 1){
            return "1";
        }
        else {
            int quotient = (int) Math.floor(decNumber/2);
            int remainder = decNumber % 2;
            return decimalToBinary(quotient) + remainder;
        }
    }
    
    public static void main(String[] args){
        System.out.println();
        System.out.println(decimalToBinary(97));
        System.out.println();
    }
}