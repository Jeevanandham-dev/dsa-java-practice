//source: leetcode problem - 1832
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

import java.util.*;
public class PangramSentence {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String Sentence = obj.nextLine();
        System.out.println(checkIfPangram(Sentence));
        

    }

     static boolean checkIfPangram(String sentence) {
        for(char i = 'a';i<='z';i++){
            if(sentence.indexOf(i)==-1)
            return false;
        }
        return true;
    }
}
