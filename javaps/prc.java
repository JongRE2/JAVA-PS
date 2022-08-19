package javaps;

import java.util.Scanner;

public class prc {

    public static String longStc(String arr){

        int minLen = Integer.MIN_VALUE;
        String stored = "";
        for(String vc : arr.split(" ")){
            int len = vc.length();
            if(len > minLen){
                minLen = len;
                stored = vc;
            }
        }//for
        return stored;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String oneLine = sc.nextLine();

        System.out.println(longStc(oneLine));
    }
}
//it is time to study
