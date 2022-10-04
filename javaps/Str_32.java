package javaps;

import java.util.HashMap;
import java.util.Scanner;

public class Str_32 {

    static boolean solution(String s1, String s2){

        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            h1.put(c, h1.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            h2.put(c, h2.getOrDefault(c, 0) + 1);
        }
        boolean check = true;
        for (Character c : h2.keySet()) {
            if(h2.get(c) != h1.get(c)){
                check = false;
                break;
            }
        }
        return check;
    }

    static public void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(solution(str1, str2) == true? "YES" : "NO");
    }
    /*
    AbaAeCe
    baeeACA
    abaCC
    Caaab
     */
}
