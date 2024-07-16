package Stacks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeCheck {
    public static boolean palindromeCheck(String word){
        Queue<Character> wordQueue = new LinkedList<>();
        for(char c : word.toCharArray()){
            wordQueue.add(c);
        }
        String reverseWord = new StringBuilder(word).reverse().toString();
        Queue<Character> reverseWordQueue = new LinkedList<>();
        for(char c : reverseWord.toCharArray()){
            reverseWordQueue.add(c);
        }

        while(!wordQueue.isEmpty() && !reverseWordQueue.isEmpty()){
            if(wordQueue.remove() != reverseWordQueue.remove()){
                return false;
            }
        }

        if(wordQueue.isEmpty() != reverseWordQueue.isEmpty()){
            return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindromeCheck("mom"));
        System.out.println(palindromeCheck("foo"));
    }
}
