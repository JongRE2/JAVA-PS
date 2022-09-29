package javaps;

import java.util.Scanner;
public class Cau01 {

    static void solution(int a, int b){

        int aa = 100 - a;
        int bb = 100 - b;
        int c_front = 100 - (aa + bb);
        int c_stored = c_front;
        int d_back = aa*bb;
        int d_stored = d_back;
        int q = d_back / 100, r = d_back % 100;
        if(q != 0){
            c_front += q;
            d_back = r;
        }
        System.out.println(aa + " " + bb + " " + c_stored + " " + d_stored + " " + q + " " + r);
        System.out.println(c_front + " " + d_back);

    }

    public static void main(String[] args){

        Cau01 c = new Cau01();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        c.solution(a, b);
        /*
        97 96
         */
    }
}
