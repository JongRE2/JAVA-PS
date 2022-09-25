package javaps;

import java.util.Scanner;

public class Str_27 {

    static int solution(int[] arrs, int k){
        int startN = 0, endN = k;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < k; i++){
            sum += arrs[i];
        }
        maxSum = sum;

        for(int i = 0; i < arrs.length - k; i++){
            sum = sum - arrs[i] + arrs[i+k];
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arrs = new int[n];
        for(int i = 0; i < n; i++){
            arrs[i] = sc.nextInt();
        }
        System.out.println(solution(arrs, k));
    }
    /*
    10 3
12 15 11 20 25 10 20 19 13 15
     */
}
