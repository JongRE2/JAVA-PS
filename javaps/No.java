package javaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No {

    static String solution(int[] nums, String[] titles, int target){

        int low = 0, high = nums.length - 1;
        int mid = 0;
        String storedStr = "";
        while(low < high){
            mid = (low + high) / 2;
            if(nums[mid] >= target) high = mid;
            else if(nums[mid] < target) low = mid + 1;

        }

        return titles[low];
    }

    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();


        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        int[] nums = new int[n];
        String[] titles = new String[n];

        int[] stdNum = new int[m];

        for(int i = 0; i < n; i++){

            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            titles[i] = stringTokenizer.nextToken();
            nums[i] = Integer.parseInt(stringTokenizer.nextToken());

        }//for
        String[] arrs = new String[m];
        for(int i = 0;i < m; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            stdNum[i] = Integer.parseInt(stringTokenizer.nextToken());
            arrs[i] = solution(nums, titles, stdNum[i]);
        }

        for (String arr : arrs) {

            stringBuilder.append(arr).append("\n");
        }
        System.out.print(stringBuilder);

/*
1 8
weak 10000
 */


    }

}
