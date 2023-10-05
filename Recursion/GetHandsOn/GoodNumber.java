package Recursion.GetHandsOn;

import java.util.*;

public class GoodNumber {
    public static void main(String[] args) {
        int a = 840; int b = 850; int digit=6;
        List<Integer> al = goodNumbers(a, b, digit);
        for(int val : al){
            System.out.print(val+" ");
        }
    }
    private static List<Integer> goodNumbers(int a, int b, int digit) {
        List<Integer> al = new ArrayList<>();

        for(int i=a; i<=b; i++){
            String str=Integer.toString(i);
            int sum = 0;
            int j = str.length()-1;
            while(j>=0){
                int val = str.charAt(j)-'0';
                if(val==digit) break;
                else{
                    if(j==(str.length()-1)){
                        sum = sum+val;
                    }else{
                        if(val>sum){
                            sum += val; 
                        }else{
                            break;
                        }
                    }
                }
                j--;
                // System.out.print(val+" "+sum);
            }
            // System.out.println();
            // System.out.println(i+":"+str+":"+sum+":"+j);
            if(j<0){
                al.add(i);
            }
        }
        return al;
    }
}
