package javaps;

import java.util.Scanner;

public class Str_9 {

    static int solution(String str){

        char[] arrs = str.toCharArray();
        String tmp = "";
        int sum = 0;
        for (char arr : arrs) {
            if(Character.isDigit(arr)){
                tmp += arr;
            }
        }//for
        return Integer.parseInt(tmp);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String inputs = sc.next();
        System.out.println(solution(inputs));
    }
    //g0en2T0s8eSoft
}
