package GreedyAlgorithm.Easy;
import java.util.*;

public class AssignCookies {
    public static void main(String[] args) {
        int[] arr ={4, 6, 2, 90, 1};
        int[] arr2 = {5, 6, 2, 2, 8};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int val : arr){
            pq.add(val);
        }
        System.out.println(assignCookie(arr, arr2));
    }
    public static int assignCookie(int []greed, int []size) {

        // Write your code here.

        PriorityQueue<Integer>pq1=new PriorityQueue<>(Collections.reverseOrder());

        PriorityQueue<Integer>pq2=new PriorityQueue<>(Collections.reverseOrder());

        for (int person : greed) {

            pq1.add(person);

        }

         for (int cookie : size) {

            pq2.add(cookie);

        }

        int count=0;

        while(!pq1.isEmpty() && !pq2.isEmpty()){

            if(pq1.peek()<=pq2.peek()){

                count++;

                pq1.poll();

                pq2.poll();

            }else{

                pq1.poll();

            }

        }

        return count;

    }

 
}
