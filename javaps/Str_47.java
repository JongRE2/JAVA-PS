package javaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Str_47 {

    static String solution(){

        Queue<Integer> q = new LinkedList<>();


    }

    static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int s = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        int[] arrs = new int[n];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < n; i++){
            arrs[i] = Integer.parseInt(stringTokenizer.nextToken());
        }



    }
    /*
    캐시메모리 : CPU와 주기억장치(DRAM) 사이의 고속 임시 메모리다.
    메모리의 사용규칙 중 해당 캐시메모리는 LRU 알고리즘을 따른다고 가정

     */

}
