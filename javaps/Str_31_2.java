package javaps;

import java.util.HashMap;
import java.util.Scanner;

public class Str_31_2 {


    static char solution(int n, String s){
        int max = Integer.MIN_VALUE;
        char maxVal = ' ';
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character k : map.keySet()) {
            if(map.get(k) > max){
                max = map.get(k);
                maxVal = k;
            }
        }
        return maxVal;
    }



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n, str));
    }
}
