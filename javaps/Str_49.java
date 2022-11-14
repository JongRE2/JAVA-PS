package javaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Str_49 {

    static void solution(int n, int[] arrs){

        int[] copy = new int[n];
        for (int i = 0; i < n; i++) copy[i] = arrs[i];

        //선택정렬로 sort
        int stored;
        for(int i = 0; i < n - 1; i++){
            int idx = i;
            for(int j = i + 1; j < n;j++){
                if(arrs[idx] > arrs[j]) idx = j;
            }
            stored = arrs[idx];
            arrs[idx] = arrs[i];
            arrs[i] = stored;
        }
        boolean check = false;
        int first = -1, second = -1;
        for(int i = 0; i < n; i++){
            if(copy[i] != arrs[i]){
                if(!check) {
                    first = i + 1;
                    check = true;
                }
                else second = i + 1;
            }
        }
        System.out.println(first + " " + second);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());


        int n = Integer.parseInt(stringTokenizer.nextToken());
        int[] arrs = new int[n];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < n; i++){
            arrs[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        solution(n, arrs);

    }
    /*
    9
    120 125 152 130 135 135 143 127 160

    30
122 123 125 125 128 130 133 137 138 138 140 141 142 143 145 147 149 149 154 154 155 157 161 167 167 167 161 170 173 173
     */
}
