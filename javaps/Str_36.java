package javaps;

import java.util.Scanner;
import java.util.Stack;

public class Str_36 {

    static String solution(String str){

        char[] arrStr = str.toCharArray();
        Stack<Character> st = new Stack<>();
        for (char c : arrStr) {
            if(c == '('){
                st.push(c);

            }
            else if(c == ')'){
                if(!st.empty() && st.peek() == '('){
                    st.pop();
                }else{
                    st.push(c);
                }
            }
        }//for
        if(st.empty()) return "YES";

        return "NO";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
    /*
    (()(()))(()
     */
}
