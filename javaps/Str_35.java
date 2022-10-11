package javaps;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Str_35 {

    static int solution(int n, int k, int[] arrs){
        int[] storedRank = new int[50];
        TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i < n-2; i++){
            for(int j = i+1; j < n-1; j++){
                for(int w = j+1; w < n; w++){
                    tset.add(arrs[i] + arrs[j] + arrs[w]);
                }
            }
        }//for
        int cnt = 1;
        for (Integer integer : tset) {
            if(cnt == k) return integer;
            cnt++;
        }
        return -1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arrs = new int[n];
        for(int i = 0; i < n; i++){
            arrs[i] = sc.nextInt();
        }
        System.out.println(solution(n, k, arrs));
    }
    /*
    10 3
    13 15 34 23 45 65 33 11 26 42
     */
}
