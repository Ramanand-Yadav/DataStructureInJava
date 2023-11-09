package Recursion.tryingOutAllCombination;

import java.util.*;

public class stringAbbreation {
    public static void main(String[] args) {
        String str = "123";
        int target = 6;
        List<String> ans = addOperators(str, target);
        for(String val : ans){
            System.out.println(val+" ");
        }
    }
    public static List<String> addOperators(String num, int target) {
        System.out.println("call add");
        List<String>ans = new ArrayList<>();
        solve(num,target,ans,"",0,0,0);
        return ans;

    }
    public static void solve(String str, int t, List<String>ans, String path,int pos, long eval, long multed){
        if(pos==str.length()){
            // System.out.print(res+"->"+val+"->"+ind+", ");
            if(eval==t){
                ans.add(path);
            }
            return;
        }
        for(int i=pos; i<str.length();i++){
            if(i!=pos && str.charAt(pos)=='0')break;
            long cur = Long.parseLong(str.substring(pos, i+1));
            if(pos==0){
                solve(str,t,ans,cur+"",i+1,cur,cur);
            }else{
                solve(str,t,ans,path+"+"+cur,i+1,eval+cur,cur);
                solve(str,t,ans,path+"-"+cur,i+1,eval-cur,-cur);
                solve(str,t,ans,path+"*"+cur,i+1,eval-multed+multed*cur,multed*cur);
            }
        }
    }
}
