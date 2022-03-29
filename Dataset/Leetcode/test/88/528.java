 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
    //        定义三个指针
        int i = m-1;    //nums1末尾元素
        int j = n-1;    //nums2末尾元素
        int k = m+n-1;

        while(j>=0){
            if (i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        
    }
}

