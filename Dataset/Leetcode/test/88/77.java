 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {

       int end = nums1.length - 1;    
       int right1 = m - 1;                    
       int right2 = n - 1;
       
       while(right1 >= 0 || right2 >= 0){

           if(right2 < 0) break;
           if(right1 < 0){
               while(right2 >= 0)   nums1[end--] = nums2[right2--];
               break;
           }

           if(nums2[right2] >= nums1[right1]){
               nums1[end --] = nums2[right2];
               right2 --;
           } 
           else{
               nums1[end --] = nums1[right1];
               right1 --;
           }
       }
    }
}

