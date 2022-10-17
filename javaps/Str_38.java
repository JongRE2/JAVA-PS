package javaps;

import java.util.Arrays;
import java.util.Scanner;

public class Str_38 {

    static public void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] boards = new int[n][n];
        for (int i = n-1; i >= 0; i--){
            for(int j = 0; j < n; j++){
                boards[i][j] = sc.nextInt();
            }
        }//for끝
        System.out.println(boards);
        /*
        0 0 0 0 0
        0 0 1 0 3
        0 2 5 0 1
        4 2 4 4 2
        3 5 1 3 1
         */
    }
}
