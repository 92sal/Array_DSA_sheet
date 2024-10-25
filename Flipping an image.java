//que link-https://leetcode.com/problems/flipping-an-image/description/
class Solution {
    public static void main(String args[]){
      int image[][]={{1,1,0},{1,0,1},{0,0,0}};
      flipAndInvertImage(image);
    }
      
    public static int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<(m+1)/2;j++){//odd even me both m kam krti h
             int temp=image[i][j]^1;//1-0,
             image[i][j]=image[i][m-1-j]^1;//0-1
             image[i][m-1-j]=temp;
            }
        }
   return image;
    }
}
