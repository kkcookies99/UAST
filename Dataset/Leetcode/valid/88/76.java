 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int temp2 = n-1;
        int temp1 = m-1;
        int i = m + n -1;
        while(temp1>=0 && temp2>=0){
            if(nums1[temp1] > nums2[temp2]){
                nums1[i--] = nums1[temp1--];
            }else{
                nums1[i--] = nums2[temp2--];
            }
        }
        while(temp1 >= 0){
            nums1[i--] = nums1[temp1--];
        }
        while(temp2 >= 0){
            nums1[i--] = nums2[temp2--];
        }
    }
}

