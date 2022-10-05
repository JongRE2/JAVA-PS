package javaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Str_33 {

    static ArrayList<Integer> solution(int n, int k, int[] arrs){
        ArrayList<Integer> stored = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < k-1; i++){
            map.put(arrs[i], map.getOrDefault(arrs[i], 0) + 1);
        }
        int lt = 0;
        for(int rt = k-1; rt < n; rt++){
            map.put(arrs[rt], map.getOrDefault(arrs[rt], 0) + 1);
            stored.add(map.size());
            map.put(arrs[lt], map.get(arrs[lt]) - 1);
            if(map.get(arrs[lt]) == 0) map.remove(arrs[lt]);
            lt++;
        }

        return stored;
    }

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arrs = new int[n];
        for(int i = 0; i < n; i++){
            arrs[i] = sc.nextInt();
        }
        for (Integer itg : solution(n, k , arrs)) {
             System.out.print(itg + " ");
        }
    }
    /*
    7 4
    20 12 20 10 23 17 10
     */
}
