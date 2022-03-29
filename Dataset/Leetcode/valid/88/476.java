 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int index_nums1=n+m-1;
        m-=1;
        n-=1;
        while(m>=0 && n>=0){
            if(nums1[m]>nums2[n]){
                nums1[index_nums1]=nums1[m];
                m--;
            }
            else{
                nums1[index_nums1]=nums2[n];
                n--;
            }
            index_nums1--;
        }
        if (n>=0){
            for(;index_nums1>=0;index_nums1--){
                nums1[index_nums1]=nums2[n--];
            }
        }
    }
}

