package basic.inflearn;

import java.util.Scanner;

public class Main {

    /*
     * for i ~ n :
     *      cnt <- 1
     *      for j ~ n :
     *          if arr[j] > arr[i] :
     *              cnt++
     *      answer[i] = cnt;
     */

    public int[] solution(int n, int[] arr) {

       int[] answer = new int[n];

       for(int i=0; i<n; i++){
           int cnt = 1;
           for(int j=0; j<n; j++){
               if(arr[j] > arr[i]) cnt++;
           }
           answer[i] = cnt;
       }

        return answer;
    }

    public static void main(String[] args) {

        //Input:    5
        //          87 89 92 100 76
        //Output:   4 3 2 1 5

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }

        for(int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }

    }


}