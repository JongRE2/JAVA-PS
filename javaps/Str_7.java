package javaps;

import java.util.Scanner;

public class Str_7 {

    static String solution(String str){

        String check = "YES";
        int lt = 0;
        int rt = str.length()-1;
        char[] charArr = str.toCharArray();
        while(lt < rt){
            char ltVal = Character.toUpperCase(charArr[lt]);
            char rtVal = Character.toUpperCase(charArr[rt]);
            if(ltVal != rtVal) {
                check = "NO";
                break;
            }
            lt++;
            rt--;
        }//while
        return check;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(5/2);
        System.out.println(solution(str));
    }//main
    //gooG
}
