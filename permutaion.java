package backrack;

import java.util.ArrayList;
import java.util.List;

public class permutaion {
    static void sub(String str,String s){
        if(str.equals("")){
            System.out.println(s);
            return;
        }
        for(int i=0;i<str.length();i++){
            String sb=str.substring(0,i);
            String right=str.substring(i+1);
            sub(sb+right,s+str.charAt(i));
        }
    }

    static void sub(int arr[],List<List<Integer>> ans,boolean isVis[],List<Integer> ds){
        if(ds.size()== arr.length){
            List<Integer> cur=new ArrayList<>();
            System.out.println(ds);
            cur.addAll(ds);
            ans.add(cur);
            return;
        }
        for(int i=0;i< arr.length;i++){
            if(!isVis[i]){
                isVis[i]=true;
                ds.add(arr[i]);
                sub(arr,ans,isVis,ds);
                isVis[i]=false;
                ds.remove(ds.size()-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> ans=new ArrayList<>();
        boolean isVis[]=new boolean[arr.length];
        List<Integer> ds=new ArrayList<>();
       sub(arr,ans,isVis,ds);

    }
}
