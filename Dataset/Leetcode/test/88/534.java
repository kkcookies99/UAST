 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        while(n != 0 && m != 0){//m，n都不为0
            if(nums2[n - 1] > nums1[m - 1] ){
                nums1[m + n - 1] = nums2[n - 1];
                n--;
            }else{
                nums1[m + n - 1] = nums1[m - 1];
                m--;
            }
        }
        while(m == 0 && n-- != 0) nums1[n] = nums2[n];//判断m为0，n不为0的情况，
    }
}```

