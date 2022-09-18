package javaps;

import java.util.Arrays;
import java.util.Scanner;

public class Str_21 {

    static boolean checkRange(int x, int y, int n){
        if( x >= 0 && x < n && y >= 0 && y < n) return true;
        return false;
    }

    static int incVertical(int[][] arr, int x, int y, int n){
        int dx = 0, sum = 0;
        while(checkRange(dx, y, n)){
            sum += arr[dx][y];
            dx++;
        }
        return sum;
    }

    static int incHorizon(int[][] arr, int x, int y, int n){
        int dy = 0, sum = 0;
        while(checkRange(x, dy, n)){
            sum += arr[x][dy];
            dy++;
        }
        return sum;
    }

    static int diagonal(int[][] arr){

        int x = 0, y = 0, sum = 0;
        while(checkRange(x, y, arr.length)){
            sum += arr[x][y];
            x++; y++;
        }//while
        int maxVal = sum;
        y = 0;
        x = arr.length - 1;
        sum = 0;
        while(checkRange(x, y, arr.length)){
            sum += arr[x][y];
            x--; y++;
        }//while
        maxVal = sum > maxVal? sum : maxVal;
        return maxVal;
    }

    static int solution(int[][] arr, int n){

        int maxVal = diagonal(arr);
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = incVertical(arr,0 , i, n);
            maxVal = sum > maxVal? sum : maxVal;
        }
        for(int i = 0; i < n; i++){
            sum = incHorizon(arr, i, 0, n);
            maxVal = sum > maxVal? sum : maxVal;
        }

        return maxVal;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arrs = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arrs[i][j] = sc.nextInt();
            }
        }

        System.out.println(solution(arrs, n));
    }
    /*
    5
    10 13 10 12 15
    12 39 30 23 11
    11 25 50 53 15
    19 27 29 37 27
    19 13 30 13 19
     */
}
