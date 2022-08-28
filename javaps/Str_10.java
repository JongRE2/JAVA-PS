package javaps;

import java.util.Scanner;

import static java.lang.Math.*;

public class Str_10 {

    static int[] solution(String str, char s){
        int[] arr = new int[str.length()];
        int p = 1000;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) == s){
                p = 0;
                arr[i] = p;
            }else{
                p += 1;
                arr[i] = p;
            }
        }//for
        p = 1000;
        for(int i = str.length() - 1; i >= 0;i--){
            if(str.charAt(i) == s){
                p = 0;
                arr[i] = p;
            }else{
                p += 1;
                arr[i] = Math.min(arr[i], p);
            }
        }
        return arr;
    }


    static public void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char s = sc.next().charAt(0);
        for (int ss : solution(str, s)) {
            System.out.print(ss + " ");
        }
        System.out.println();
    }
    //teachermode e
}
