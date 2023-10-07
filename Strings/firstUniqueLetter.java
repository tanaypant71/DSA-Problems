//Brute Force

import java.io.*;
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        String string = "Hello";
        int index = -1;
        char fnc = ' ';

        if (string.length() == 0) {
            System.out.println("EMPTY STRING");
        }

        for (char i : string.toCharArray()) {
            if (string.indexOf(i) == string.lastIndexOf(i)) {
                fnc = i;
                break;
            } else {
                index += 1;
            }
        }

        if (index == string.length() - 1) {
            System.out.println("All characters are repeating");
        } else {
            System.out.println("First non-repeating character is " + fnc);
        }
    }}

    // Using Hashmap

    HashMap<Character, Integer> map = new HashMap<>();
    int n = str.length();for(
    int i = 0;i<n;i++)
    {
        Character currChar = str.charAt(i);
        if (map.containsKey(currChar) == false) {
            map.put(currChar, 1);
        } else {
            int currFreq = map.get(currChar);
            currFreq++;
            map.put(currChar, currFreq);
        }
    }

    for(i=0;i<n;i++)
{
    Character currChar = str.charAt(i);
    int currFreq = map.get(currChar);
    if (currFreq==1) {
        System.out.println("unique letter: "+currChar);
        break;
    }
    else{
        return -1;
    }
}