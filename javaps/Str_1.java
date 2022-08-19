package javaps;

import java.util.Scanner;


public class Str_1 {

    public int solution(String str, char c){

        int cnt = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(char cc : str.toCharArray()){
            if(cc == c) cnt++;
        }

        return cnt;
    }


    public static void main(String[] args){

        Str_1 f = new Str_1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.print(f.solution(str, c));
    }

}

////////////////////////////////////////////////////////////////////////////////////////////////
//public class Findchar {
//
//    public int solution(String str, char c){
//
//        int val = 0;
//        str = str.toUpperCase();
//        c = Character.toUpperCase(c);
//
//        for(int i = 0; i <str.length(); i++){
//            if(str.charAt(i) == c) val++;
//        }
//        return val;
//    }
//
//
//    public static void main(String[] args){
//        Findchar T = new Findchar();
//
//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.next();
//        char c = sc.next().charAt(0);
//        System.out.print(T.solution(str, c));
//
//    }
//
//}
