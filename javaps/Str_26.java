package javaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Str_26 {

    static ArrayList<Integer> solution(int a, int[] arrA, int b, int[] arrB){
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        int ap = 0, bp = 0;
        ArrayList<Integer> commonVals = new ArrayList<Integer>();
        while(ap < a && bp < b){
            if(arrA[ap] == arrB[bp]){
                commonVals.add(arrA[ap]);
                ap++; bp++;
            }else if(arrA[ap] > arrB[bp]){
                bp++;
            }else{
                ap++;
            }
        }//while


        return commonVals;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arrA = new int[a];
        for(int i = 0; i < a; i++){
            arrA[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int[] arrB = new int[b];
        for(int i = 0; i < a; i++){
            arrB[i] = sc.nextInt();
        }
        for (Integer integer : solution(a, arrA, b, arrB)) {
            System.out.print(integer + " ");
        }

    }
    /*
    5
    1 3 9 5 2
    5
    3 2 5 7 8
     */
}
