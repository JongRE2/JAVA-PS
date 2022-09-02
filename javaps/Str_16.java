package javaps;

import java.util.ArrayList;
import java.util.Scanner;

public class Str_16 {


    static ArrayList<Integer> solution(int num){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        arr.add(1);
        int val;
        for (int i = 2; i <= num; i++){
            val = arr.get(i - 1) + arr.get(i - 2);
            arr.add(val);
        }
        arr.remove(0);
        return arr;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (Integer integer : solution(num)) {
            System.out.print(integer + " ");
        }
    }
    //10
}
