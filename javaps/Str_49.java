package javaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Str_49 {

    static void solution(int n, int[] arrs){




        boolean check = false;
        int first = 0, second = 0;
        for(int i = 0; i < n-1; i++){
            if(arrs[i] > arrs[i+1]){
                if(!check){
                    first = i+1;
                    check = true;
                }
                else second = i+2;
            }
        }//for
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
     */
}
