package javaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Str_46 {


    // 삽입정렬 ( insert sort)
    static StringBuilder solution(int n, int[] arrs){

        StringBuilder stringbuilder = new StringBuilder();
        for(int i = 1; i < n; i++){
            int tmp = arrs[i];
            int j;
            for(j = i - 1; j >= 0; j--){
                if(arrs[j] > tmp) arrs[j+1] = arrs[j];
                else break;
            }
            arrs[j+1] = tmp;
        }

        for(int i = 0; i < n; i++){
            stringbuilder.append(arrs[i]).append(" ");
        }
        return stringbuilder;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
//        StringBuilder stringBuilder = new StringBuilder();

        int n = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] arrs = new int[n];

        for(int i = 0; i < n; i++){
            arrs[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.println(solution(n, arrs));

    }
    /*
    6
    11 7 5 6 10 9
     */
}
