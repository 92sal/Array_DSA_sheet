
class Solution {
    public static void main(Strings args[]){
     String  s = "loveleetcode";
      char c = "e" ;
      shortestToChar(s,c);
       }
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> ls=new ArrayList<>();
        int answer[]=new int [s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
            ls.add(i);
            }
        }int min=Integer.MAX_VALUE;
      for(int i=0;i<s.length();i++){
       
             int minn=Integer.MAX_VALUE;
            for(int j=0;j<ls.size();j++){
                minn=Math.min(minn,Math.abs(i-ls.get(j)));
            }
            answer[i]=minn;
        }
      
       
        
return answer;
    }}
}
