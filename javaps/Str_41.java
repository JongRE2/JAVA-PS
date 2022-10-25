package javaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Str_41 {

    static int solution(int n, int k){

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) q.offer(i);
        int cnt = 1;
        while(q.size() != 1){
            if(cnt == k){
                q.poll();
                cnt = 1;
            }else{
                q.offer(q.poll());
                cnt++;
            }
        }
        return q.poll();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());

        System.out.println(solution(n, k));

    }
    /*
    8 3

     */
}
