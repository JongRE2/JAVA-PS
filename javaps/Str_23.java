package javaps;

import java.util.Scanner;

public class Str_23 {

    static int solution(int n, int[][] arr){
        int maxval = Integer.MIN_VALUE;
        int studentsId = 0;
        for(int i = 0; i < n; i++){
            int cnt = 0;
            for(int j = 0; j < n; j++){
                for(int k = 0; k < 5; k++){
                    if(arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > maxval){
                maxval = cnt;
                studentsId = i+1;
            }
        }
        return studentsId;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arrs = new int[n][5];



        for(int i = 0; i < n; i++){
            for(int j = 0; j < 5; j++){
                arrs[i][j] = sc.nextInt();
            }
        }//for
        System.out.println(solution(n, arrs));
        /*
        5
        2 3 1 7 3
        4 1 9 6 8
        5 5 2 4 4
        6 5 2 6 7
        8 4 2 2 2
         */
    }
}
