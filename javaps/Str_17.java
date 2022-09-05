package javaps;

import java.util.Scanner;

public class Str_17 {

    static int solution(int num){
        int[] arrs = new int[num+1];
        System.out.println(arrs[1]);

        for(int i = 2; i <= Math.abs(num); i++){
            int check;
            if(arrs[i] == 0){
                check = i;
            }else{
                continue;
            }
            for(;check <= num; check+=check){
                arrs[check] = 1;
                System.out.println("check : " + check);
            }
        }
        int sum = 0;
        for (int arr : arrs) {
            sum += arr;
        }
        System.out.println(sum);
        return num - sum;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution(num));

    }
}
