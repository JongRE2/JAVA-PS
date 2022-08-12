package javaps;

import java.util.Scanner;

public class Str_2 {

    static String solution(String s){

        String answer = "";
        for(char cc : s.toCharArray()){
            if(cc >= 65 && cc <=90){
                answer += (char)(cc + 32);
            }else if( cc >= 97 && cc <= 122){
                answer += (char)(cc - 32);
            }
        }//for
    return answer;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String stc = sc.next();

        System.out.print(solution(stc));


    }
}
