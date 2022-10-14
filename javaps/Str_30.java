package javaps;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Str_30 {

    static int solution(int n, int k ,int[] arrs){

        int lt = 0, cnt = 0, maxLen = 0, answer = 0;

        for(int rt = 0; rt < n; rt++){
            if(arrs[rt] == 0) cnt++;
                while(cnt > k){
                    if(arrs[lt] == 0){
                        cnt--;
                    }
                    lt++;
                }
                answer = rt - lt + 1;
                maxLen = Math.max(answer, maxLen);


        }

        return maxLen;
    }

    static public void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arrs = new int[n];

        for(int i = 0;i < n; i++){
            arrs[i] = sc.nextInt();
        }
        System.out.println(solution(n, k ,arrs));


        /*
        14 2
        1 1 0 0 1 1 0 1 1 0 1 1 0 1
         */
    }
}
