package basic.inflearn;

import java.util.Scanner;

public class Main {

    /*
     * for i ~ n :
     *      tmp <- s.substring(0, 7)
     *      tmp <- tmp.replace # to 1, * to 0
     *      num <- tmp to (int, decimal)
     *      answer += num to char
     */

    public String solution(int n, String s) {

        String answer = "";

        for(int i=0; i<n; i++){
            String tmp = s.substring(0, 7).replace('#', '1').replace('*','0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;

            s = s.substring(7);
        }

        return answer;
}

    public static void main(String[] args) {

        //Input: 4
        //       #****###**#####**#####**##**
        //Output: COOL

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));

    }

}