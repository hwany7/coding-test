package basic.inflearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {

    /*
     * new Queue
     * for x in need:
     *      queue.offer(x)
     * for x in plan:
     *      if queue.contain(x):
     *          if x != queue.pool():
     *              return "NO"
     * if queue.inNotEmpty():
     *      return "NO"
     *
     * return "YES"
     */

    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> qu = new LinkedList<>();

        for(char x : need.toCharArray()){
            qu.offer(x);
        }

        for(char x : plan.toCharArray()){
            if(qu.contains(x)){
                if(x != qu.poll()) return "NO";
            }
        }

        if(!qu.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {

        //Input:    CBA
        //          CBDAGE
        //Output:   YES

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String a = kb.next();
        String b = kb.next();

        System.out.println(T.solution(a, b));

    }

}