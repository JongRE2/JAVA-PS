package javaps;

import java.util.Arrays;
import java.util.Scanner;

public class Str_25 {

    static int[] solution(int n1, int[] arr1, int n2, int[] arr2){

        int[] arrs = new int[n1+n2];
        int left1 = 0, left2 = 0;
        int cnt = 0;
        while(left1 != n1 && left2 != n2){
            if(arr1[left1] < arr2[left2]){
                arrs[cnt] = arr1[left1++];
            }else{
                arrs[cnt] = arr2[left2++];

            }
            cnt++;
        }//while

        if(left1 == n1){
            while (cnt != n1 + n2){
                arrs[cnt++] = arr2[left2++];
            }
        }else{
            while (cnt != n1 + n2){
                arrs[cnt++] = arr1[left1++];
            }
        }
        return arrs;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int j = 0; j < n2; j++){
            arr2[j] = sc.nextInt();
        }
        for (int i : solution(n1, arr1, n2, arr2)) {
            System.out.print(i + " ");
        }
    }
    /*
    3
    1 3 5
    5
    2 3 6 7 9
     */
}
