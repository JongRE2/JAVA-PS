package javaps;

import java.util.Scanner;

public class Str_14 {

    static int solutions(int n, int[] arrs){
        int cnt = 1;
        int max = arrs[0];
        for(int i = 1; i < n; i++){
            if(max < arrs[i]){
                cnt++;
                max = arrs[i];
            }
        }
        return cnt;
    }

    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrs = new int[n];
        for (int i = 0; i < n; i++){
            arrs[i] = sc.nextInt();
        }
        System.out.println(solutions(n, arrs));
    }
}
