package javaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Str_40 {

    static int solution(String str){


        Stack<Character> stored = new Stack<>();
        char beforeVal = 'a';
        int totalVal = 0;
        for(char c : str.toCharArray()){
            if(c == '(') stored.push(c);
            else{
                if(beforeVal == '(' && !stored.isEmpty()){
                    stored.pop();
                    totalVal += stored.size();
                }else{
                    if(!stored.isEmpty()){
                        stored.pop();
                        totalVal += 1;
                    }
                }
            }
            beforeVal = c;
        }

        return totalVal;
    }

    static public void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        String str = stringTokenizer.nextToken();

        System.out.println(solution(str));

    }
    /*
    ()(((()())(())()))(())
     */
}
