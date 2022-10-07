package javaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Str_31 {

    static char solution(String strs){


        int[] storedArrs = new int[5];
        int maxVal = 0, flag = 0;
        for (char str : strs.toCharArray()) {
            storedArrs[str-'A']++;
        }
        for(int i = 0; i < 5; i++){
            if(storedArrs[i] > maxVal){
                maxVal = storedArrs[i];
                flag = i;
            }
        }

//        System.out.println(Arrays.toString(storedArrs));
//        System.out.println(maxVal);
        return (char)('A' + flag);
    }

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String strs = sc.next();

        System.out.println(solution(strs));
    }
    /*
    15
    BACBACCACCBDEDE


    20
BDDAAAAEDCAACBAAABAC
     */
}
