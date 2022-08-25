package javaps;

import java.util.Scanner;

public class Str_8 {

    static String solution(String str){

        String tmp = "";
        char[] arrays = str.toCharArray();
        for (char array : arrays) {
            if(Character.isAlphabetic(array)){
                tmp += array;
            }
        }
        tmp = tmp.toUpperCase();
        int lt = 0, rt = tmp.length() - 1;
        String check = "YES";
        while(lt < rt){
            if(tmp.charAt(lt) != tmp.charAt(rt)){
                check = "NO";
                break;
            }
            lt++; rt--;
        }

        return check;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String lines = sc.nextLine();

        System.out.println(solution(lines));
    }
    //found7, time: study; Yduts; emit, 7Dnuof
}
