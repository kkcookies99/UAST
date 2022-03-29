 class Solution {
    public static void main(String[] args) {
       int nums[] = {2,7,11,15};
       int target = 9;
       for(int i = 0; i < nums.length ; i=i+2){
           if(nums[i]+nums[i+1] == target){
               int a[] = new int[]{i,i+1};
               return a;
           }
       }
       return null;
    }
}


