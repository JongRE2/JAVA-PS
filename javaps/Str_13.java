package javaps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Str_13 {

    static ArrayList<Integer> solutions(int n, int[] arrs){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arrs[0]);
        for (int i = 0; i < n-1; i++){
            if(arrs[i] < arrs[i+1]){
                answer.add(arrs[i + 1]);
            }
        }

        return answer;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (Integer solution : solutions(n, arr)) {
            System.out.print(solution + " ");
        }
    }
    /*
    6
    7 3 9 5 6 12
     */
}
