//que link-https://leetcode.com/problems/combination-sum/description/
class Solution {
    public static void main(String args[]){
      int []candidates={2,3,6,7};int target=7;
      combinationSum(candidates,target);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> list=new ArrayList<>();
    int s=0;
    generat(0,list,new ArrayList(),candidates,target);
     return list;
    }
    public static void generat(int s,List<List<Integer>>list,List<Integer> current,int []candidates,int target){
        
     if(target==0){
       list.add(new ArrayList(current));
     }
     if(target<0){
        return;
     }
     for(int i=s;i<candidates.length;i++){
        current.add(candidates[i]);
        generat(i,list,current,candidates,target-candidates[i]);
     
        current.remove(current.size()-1);
     }}}
    }}
