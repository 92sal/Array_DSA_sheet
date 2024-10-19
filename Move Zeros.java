//quetion link-https://leetcode.com/problems/move-zeroes/
  class Solution {
    public static void main(String args[]){
      int nums[]={0,1,0,2,12};
      moveZeroes(nums);
    }
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }

        }
        for(;j<n;j++){ 
            nums[j]=0;
        }
    }
}
