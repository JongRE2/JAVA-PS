package javaps;

import java.util.ArrayList;
import java.util.Scanner;

public class Str_15 {

    static ArrayList<Character> solution(int num, int[] arr1, int[] arr2){
        ArrayList<Character> results = new ArrayList<>();
        int check;
        int val = 0;
        for(int i = 0; i < num; i++){
            check = 0;
            if(arr1[i] == arr2[i]){
                results.add('D');
            }else if(arr1[i] > arr2[i]){
                check = 1;
                val = arr1[i] - arr2[i];
            }else{
                check = 2;
                val = arr2[i] - arr1[i];
            }
            if(val != 1 && check != 0){
                check = 3 - check;
            }

            if(check == 1){
                results.add('A');
            }else if(check == 2){
                results.add('B');
            }
        }
        return results;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr1 = new int[num];
        int[] arr2 = new int[num];
        for(int i = 0; i < num; i++){
            arr1[i] = sc.nextInt();
        }

        for(int i = 0; i < num; i++){
            arr2[i] = sc.nextInt();
        }

        for (Character val : solution(num, arr1, arr2)) {
            System.out.println(val);
        }
    }
    /*
5
2 3 3 1 3
1 1 2 2 3
     */
}
