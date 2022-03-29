 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int index = m+n-1;
             //考虑nums1为空的情况
        if(m == 0){
            while(j>=0){
                nums1[index--] = nums2[j];
                j--;
            }
        }
        //nums1的空间大小等于m+n
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[j]){
                nums1[index--] = nums1[i];
                i--;
            }else{
                nums1[index--] = nums2[j];
                j--;
            }
        }
        // while(i>=0){
        //     nums1[index--] = nums1[i];
        //     i--;
        // }
        while(j>=0){
            nums1[index--] = nums2[j];
            j--;
        }
           
    }
}

