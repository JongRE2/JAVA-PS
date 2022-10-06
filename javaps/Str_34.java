package javaps;

import java.util.HashMap;
import java.util.Scanner;

public class Str_34 {


    static int solution(String s, String t){

        int checkcnt = 0;
        HashMap<Character, Integer> standard = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();
        int stdLen = t.length();
        for(int i = 0; i < stdLen; i++){
            standard.put(t.charAt(i), standard.getOrDefault(t.charAt(i), 0)+1);
            if(i < stdLen - 1){
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            }
        }
        int lt = 0;
        for(int rt = stdLen - 1; rt < s.length(); rt++){

            map.put(s.charAt(rt), map.getOrDefault(s.charAt(rt), 0) + 1);
            if(standard.equals(map)) checkcnt++;
            map.put(s.charAt(lt), map.get(s.charAt(lt)) - 1);

            if(map.get(s.charAt(lt)) == 0){
                map.remove(s.charAt(lt));
            }

            lt++;


        }//for

        return checkcnt;
    }

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();
        System.out.println(solution(s, t));
    }
    /*
    bacaAacba
    abc

    bacaAacbaa
    abca
     */
}
