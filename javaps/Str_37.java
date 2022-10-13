package javaps;

import java.util.Scanner;
import java.util.Stack;

public class Str_37 {

    static String solution(String str){

        Stack<Character> st = new Stack<>();

        char[] arrs = str.toCharArray();
        for (char c : arrs) {

            if(c == ')'){
                do{
                    st.pop();
                }while(st.peek() != '(');
                st.pop();
            }else{
                st.push(c);
            }
        }
        String stc = "";

//        System.out.println(st.size());
        for (int n = 0; n < st.size(); n++) {
            stc += st.get(n);
        }

        return stc;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
    /*
    (A(BC)D)EF(G(H)(IJ)K)LM(N)
     */
}
