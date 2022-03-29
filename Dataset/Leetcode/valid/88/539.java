 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int index=0;
        if(n==0){
            return;
        }
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}

