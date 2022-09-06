package javaps;

import java.util.ArrayList;
import java.util.Scanner;

public class Str_18 {

    static ArrayList<Integer> solution(int[] numVal){
        ArrayList<Integer> storedArr = new ArrayList<>();

        for (int num : numVal) {
            int stored = reversedVal(num);

            int absNum = (int)Math.sqrt(stored);
            int cnt = 0;
            if(stored == 2){
                storedArr.add(stored);
                continue;
            }else if(stored == 1){
                cnt = -1;
            }
            else{
                for(int j = 2; j <= absNum; j++) {
                    if (stored % j == 0) {
                        cnt++;
                        break;
                    }
                }//for
            }//else
            if(cnt == 0){

                storedArr.add(stored);
            }
        }//for
        return storedArr;
    }

    static int reversedVal(int num){
        int answer = 0;
        while(num > 0){
            int remained = num % 10;
            num /= 10;
            answer = (answer * 10) + remained;
        }
        return answer;
    }//reversedVal

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arrVal = new int[num];
        int tmp;
        for(int i = 0; i < num; i++){
            tmp = sc.nextInt();
            arrVal[i] = tmp;
        }
        for (Integer integer : solution(arrVal)) {
            System.out.print(integer + " ");
        }
    }
    /*
9
32 55 62 20 250 370 200 30 100
     */
}
