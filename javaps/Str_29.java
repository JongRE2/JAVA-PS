package javaps;

import java.util.Scanner;

public class Str_29 {

    static int solution(int n){

        int start = 1, cnt = 0;
        int sum = start;
        for(int end = start + 1; end < n; end++){
            sum += end;
            if(sum == n){
                cnt++;
            }

            while(sum >= n){
                sum -= (start);
                start++;

                if(sum == n) {
                    cnt++;
                }
            }
        }
        return cnt;
    }


    static public void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution(num));
    }
}
