package javaps;

import java.util.Scanner;

public class Str_9 {

    static int solution(String str){

        char[] arrs = str.toCharArray();
        String tmp = "";
        int sum = 0;
        for (char arr : arrs) {
            if(arr >= '0' && arr <= '9'){
                sum = (sum * 10) + (arr - '0');
            }
        }//for
        return sum;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String inputs = sc.next();
        System.out.println(solution(inputs));
    }
    //g0en2T0s8eSoft
}
