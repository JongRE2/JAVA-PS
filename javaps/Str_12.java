package javaps;

import java.util.Scanner;

public class Str_12 {

    static String solutions(int num, String str){

        String tmp = "", answer = "";
        for(int i = 0; i < num; i++){
            tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int numTmp = Integer.parseInt(tmp, 2);
            answer += (char) numTmp;
            str = str.substring(7);
        }
        System.out.println(answer);
        return null;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int tmp1 = sc.nextInt();
        String tmp2 = sc.next();
        solutions(tmp1, tmp2);
    }
    /*
    4 #****###**#####**#####**##**
     */
}
