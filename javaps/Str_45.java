package javaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Str_45 {

    static StringBuilder solution(int n, int[] arrs){
        StringBuilder st = new StringBuilder();
        int stored;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n - i; j++){
                if(arrs[j] > arrs[j+1]){
                    stored = arrs[j];
                    arrs[j] = arrs[j + 1];
                    arrs[j+1] = stored;
                }
            }//for2
        }//for1
        for(int i = 0; i < n; i++){
            st.append(arrs[i]).append(" ");
        }
        return st;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arrs = new int[n];
        for(int i = 0; i < n; i++){
            arrs[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, arrs));

    }
    /*
    6
    13 5 11 7 23 15
     */
}
