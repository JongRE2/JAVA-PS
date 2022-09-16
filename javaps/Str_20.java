package javaps;

import java.util.Arrays;
import java.util.Scanner;

public class Str_20 {

    public static int[] solution(int n, int[] scores){
        int maxVal = -1;
        int[] ranks = new int[n];
        String rankStr = "";
        for(int i = 0; i < n; i++){
            int cnt = 1;
            for(int j = 0; j < n; j++){
                if(scores[i] < scores[j]) cnt++;
            }
            ranks[i] = cnt;
        }

        return ranks;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for(int i = 0; i < n; i++){
            scores[i] = sc.nextInt();
        }
//        System.out.println(solution(n, scores));
        for (int i : solution(n, scores)) {
            System.out.print(i + " ");
        }
    }
    /*
    5
    87 89 92 100 76
     */
}
