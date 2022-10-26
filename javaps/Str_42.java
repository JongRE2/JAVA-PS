package javaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Str_42 {


    static String solution(String essens, String seq){

        Queue<Character> q = new LinkedList<>();
        for(char c : essens.toCharArray()) q.offer(c);

        for(char c : seq.toCharArray()){

            if(q.peek() != null && c == q.peek()){
                q.poll();
            }else if(q.peek() == null){
                break;
            }
        }
        if(q.size() == 0) return "YES";

        return "NO";
    }


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();

        String essentialSub = stringTokenizer.nextToken();

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        String sequence = stringTokenizer.nextToken();

        System.out.println(solution(essentialSub, sequence));

    }
    /*
    CBA
    CBDAGE
     */
}
