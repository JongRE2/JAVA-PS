package javaps;


import java.util.Arrays;
import java.util.Scanner;

public class Str_6 {

//    static String solution(String s){
//
//        char[] check = new char[26];
//        String scs = "";
////        Arrays.fill(check, 1);
//        char[] arrs = s.toCharArray();
//        for (char arr : arrs) {
//            if(check[arr-'a'] == 1) continue;
//            else {
//                check[arr - 'a'] = 1;
//                scs += arr;
//            }
//        }
//        return scs;
//    }
    static String solution(String str){
        String tmp = "";
        //
        for (int i = 0; i <str.length();i++){
            if(str.indexOf(str.charAt(i)) == i){
                tmp += str.charAt(i);
            }
        }
        return tmp;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String inputs = sc.next();
        System.out.println(solution(inputs));
    }
    //ksekkset
}
