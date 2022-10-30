package javaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Str_44 {

    static StringBuilder solution(int[] arrs, int n, StringBuilder sb){

        int stored;
        for(int i = 0; i < n; i++){
            int idx = i;
            for(int j = i + 1; j < n; j++){
                if(arrs[idx] > arrs[j]) idx = j;
            }
            stored = arrs[idx];
            arrs[idx] = arrs[i];
            arrs[i] = stored;
        }
        for(int arr : arrs){
            sb.append(arr).append(" ");
        }
        return sb;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();


        int n = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int arrs[] = new int[n];
        for(int i = 0; i < n; i++){
            arrs[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.println(solution(arrs, n, stringBuilder));

    }
    /*
    6
    13 5 11 7 23 15
     */
}
