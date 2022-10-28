package javaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Person{

    int id;
    int dangerNum;

    public Person(int id, int dangerNum){
        this.id = id;
        this.dangerNum = dangerNum;
    }


}
public class Str_43 {


    static int solution(int n, int m, int[] arrs){

        int answer = 1;

        Queue<Person> q = new LinkedList<>();
        for (int i = 0; i < n; i++) q.offer(new Person(i+1, arrs[i]));

        while(!q.isEmpty()){
            Person tmp = q.poll();
            for(Person x : q){
                if(tmp.dangerNum < x.dangerNum){
                    q.offer(tmp);
                    tmp = null;
                    break;
                }
            }//for
            if(tmp != null){
                if(tmp.id == m) return answer;
                else answer++;
            }

        }//while
        return 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();


        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] people = new int[n];
        for(int i = 0; i < n; i++){
            people[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        System.out.println(solution(n, m, people));
//        System.out.println(Arrays.toString(people));
    }//main
/*
5 2
60 50 70 80 90
 */
}

