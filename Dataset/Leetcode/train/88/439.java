 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        if(m>=1&&n>=1){
            for(int i=m+n-1;m>0&&n>0;i--){
                if(nums1[m-1]>nums2[n-1]){
                    nums1[i]=nums1[m-1];
                    m--;
                    }
                    else{
                        nums1[i]=nums2[n-1];
                        n--;
                    }
                }
            }
        System.arraycopy(nums2,0,nums1,0,n);
    }
}

