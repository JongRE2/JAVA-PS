package javaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Str_47 {

    static void solution(int[] arrs, int s, int n){

        StringBuilder sb = new StringBuilder();
        int[] caches = new int[s];
        for(int arr : arrs){
            int pos = -1;
            for(int i = 0; i < s; i++) if(arr == caches[i]) pos = i;
            if(pos == -1){
                for (int i = s - 1; i >= 1; i--) caches[i] = caches[i - 1];
                caches[0] = arr;
            }
            else{
                for(int i = pos; i >= 1; i--) caches[i] = caches[i - 1];
                caches[0] = arr;
            }
        }//for
        for(int c : caches){
            sb.append(c).append(" ");
        }
        System.out.println(sb);

    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int s = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        int[] arrs = new int[n];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < n; i++){
            arrs[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
//        System.out.println(Arrays.toString(arrs));
        solution(arrs, s, n);

    }
    /*
    캐시메모리 : CPU와 주기억장치(DRAM) 사이의 고속 임시 메모리다.
    메모리의 사용규칙 중 해당 캐시메모리는 LRU 알고리즘을 따른다고 가정
    5 9
    1 2 3 2 6 2 3 5 7
     */

}
