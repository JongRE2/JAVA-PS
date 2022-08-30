package javaps;

import java.util.Scanner;

public class Str_11 {

    static String solution(String str){
        int cnt = 1;
        String stored = "";
        int len = str.length();
        for(int i = 0; i < len - 1 ; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt += 1;
            }else{
                stored += str.charAt(i);
                if(cnt != 1) {
                    stored += Integer.toString(cnt);
                }
                cnt = 1;
            }
        }//for
        if(cnt == 1){
            stored += str.charAt(len - 1);
        }else{
            stored += str.charAt(len - 1);
            stored += Integer.toString(cnt);
        }
        return stored;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String tmp = sc.next();
        System.out.println(solution(tmp));
    }
    //KKHSSSSSSSE
}
