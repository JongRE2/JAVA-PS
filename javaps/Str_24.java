package javaps;

import java.util.Scanner;

public class Str_24 {

    static int solution(int n, int m, int[][] arrs){
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){

                int fs = -1;
                int ss = -1;
                for(int k = 0; k < m; k++){
                    for(int s = 0; s < n; s++){
                        if(arrs[k][s] == i+1) fs = s;
                        if(arrs[k][s] == j+1) ss = s;
                    }
                    if(fs >= ss) break;
                    if(k == m-1) cnt++;
                }//k
            }
        }
        return cnt;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arrs = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arrs[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, m, arrs));
    }//main
    /*
    4 3
    3 4 1 2
    4 3 2 1
    3 1 4 2
     */
}
