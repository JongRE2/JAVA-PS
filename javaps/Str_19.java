package javaps;

import java.util.Arrays;
import java.util.Scanner;

public class Str_19 {

    public static int solution(int n, int[] arrs){
        int[] scores = new int[n];
        int sum = 0;
        sum = scores[0] = arrs[0];

        for (int i = 1; i < n; i++){

            if(arrs[i] == 1){
                scores[i] = scores[i-1] + 1;
            }else if(arrs[i] == 0){
                scores[i] = 0;
            }
            sum += scores[i];
        }

        return sum;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arrs = new int[N];
        for(int i = 0; i < N; i++){
            arrs[i] = sc.nextInt();
        }
        System.out.println(solution(N, arrs));
        /*
        10
        1 0 1 1 1 0 0 1 1 0
         */
    }
}
