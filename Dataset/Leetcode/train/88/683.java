 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        if(n==0) return;
        if(m==0){
            for(int i=0;i<n;i++){
                nums1[i]=nums2[i];
            }
        }
        for(int num2:nums2){
            for(int i=0;i<m;i++){
                if(num2<=nums1[i]){
                    m++;
                    for(int j=m-1;j>i;j--){
                        nums1[j]=nums1[j-1];
                    }
                    nums1[i]=num2;
                    break;
                }
                if(num2>nums1[m-1]){
                    m++;
                    nums1[m-1]=num2;
                    break;
                }
            }
        }
    }
}

