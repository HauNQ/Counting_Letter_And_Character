/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author quang
 */
public class Algorithm {

    
    public HashMap<String, Integer> countLetter(String paragraph) {
        HashMap<String, Integer> numberOfLetter = new HashMap<>();
        StringTokenizer st = new StringTokenizer(paragraph, "[ ]{1,}|.|,|?|:|'|");

        while (st.hasMoreElements()) {
            String key = st.nextToken();
            if (numberOfLetter.containsKey(key)) {
                numberOfLetter.put(key.toLowerCase(), numberOfLetter.get(key) + 1);
            } else {
                numberOfLetter.put(key.toLowerCase(), 1);
            }
        }

        return numberOfLetter;
    }

    public HashMap<String, Integer> countCharacter(String paragraph) {
        HashMap<String, Integer> numberOfCharacter = new HashMap<>();
        char c;
        String key;
        
        if (paragraph == null) {
            return numberOfCharacter;
        }
        for (int i = 0; i < paragraph.length(); i++) {
            c = paragraph.charAt(i);
            if (Character.isLetter(c)) {
                key = c + "";
                if (numberOfCharacter.containsKey(key)) {
                    numberOfCharacter.put(key.toLowerCase(),numberOfCharacter.get(key)+1);
                } else {
                    numberOfCharacter.put(key.toLowerCase(),1);
                }
            }
        }

        return numberOfCharacter;
    }

    public static void main(String[] args) {
        Algorithm al = new Algorithm();
        String a = "Hello Nguyen Quang  hello, Have a good day";
        HashMap<String, Integer> count = al.countLetter(a);

        for (String key : count.keySet()) {
            System.out.println(key + " : " + count.get(key));
        }
    }
}
