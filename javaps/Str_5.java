package javaps;

import java.util.Scanner;

public class Str_5 {

    public static String solution(String str){

        char tmp;
        char[] charr = str.toCharArray();
        int lt = 0, rt = charr.length - 1;
        while(lt < rt){
            if(!Character.isAlphabetic(charr[lt])){
                lt++;
            }else if(!Character.isAlphabetic(charr[rt])){
                rt--;
            }else{
                tmp = charr[lt];
                charr[lt] = charr[rt];
                charr[rt] = tmp;
                lt++; rt--;
            }

        }
        String results = String.valueOf(charr);
        return results;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

}
