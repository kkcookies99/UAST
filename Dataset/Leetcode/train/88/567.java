 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        boolean sameOrder = true;
        if(m>1&&n>1){
            if(nums1[0]<nums1[1]&&nums2[0]>nums2[1]){
                sameOrder=false;
            }
        }
        int max = m+n-1;
        if(sameOrder){
            m--;
            n--;
            while(n>=0){
                nums1[max--] = m<0||nums1[m]<nums2[n]?nums2[n--]:nums1[m--];
            }
        }else{
            m--;
            int i=0;
            while(i<n){
                nums1[max--] = m<0||nums1[m]<nums2[i]?nums2[i++]:nums1[m--];
            }
        }
    }
}

