package javaps;

import java.util.Scanner;

public class Str_3 {

    public static String splitStr(String arr){

        String stored = "", sucs = "";
        int pos, m = Integer.MIN_VALUE;
        while((pos=arr.indexOf(' ')) != -1){
            stored = arr.substring(0, pos);
            int len = stored.length();
            if(len > m){
                 sucs = stored;
                 m = len;
            }
            arr = arr.substring(pos+1);
        }

        if(arr.length() > m){
            sucs = arr;
        }

        return sucs;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String stc = sc.nextLine();

        System.out.print(splitStr(stc));

    }
}

// Hello..My..name is KIM???JONG..YUN.
//Hello.My.name is KIM???JONG.YUN.
//it is time to study