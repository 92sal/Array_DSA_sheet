//que link-https://leetcode.com/problems/assign-cookies/description/
class Solution {
    public static void main(String args []){
      int g[]={1,2,3};int s[]={1,1};
      findContentChildren(g,s);
    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);int count=0;int j=0;
         int i=0;
       while(j<g.length && i<s.length){
           if(g[j]<=s[i] ){
            count++;
            j++;
           }
         i++;
        }
  return count;  }
}}
