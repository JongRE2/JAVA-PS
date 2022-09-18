package javaps;

import java.util.Scanner;

public class Str_22 {

    static int solution(int[][] arr, int n){
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int cnt = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 0; k < 4; k++){
                    int xx = i + dx[k];
                    int yy = j + dy[k];
                    if(arr[i][j] <= arr[xx][yy]) break;
                    if(k == 3) cnt++;
                }
            }
        }//for

        return cnt;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arrs = new int[n + 2][n + 2];
        for(int i = 0; i < n+2; i++){
            for(int j = 0; j < n+2; j++){
                arrs[i][j] = (int)0;
            }

        }//for

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                arrs[i][j] = sc.nextInt();
            }
        }//for
        System.out.println(solution(arrs, n));



    }//main
    /*
    5
    5 3 7 2 3
    3 7 1 6 1
    7 2 5 3 4
    4 3 6 4 1
    8 7 3 5 2
     */
}
