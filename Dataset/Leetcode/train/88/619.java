 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int t1,t2;
        t1 = 0;
        t2 = 0;
        if(nums2.length == 0) return;
        while(t1<m){
            if(nums1[t1]<=nums2[t2]){
                t1 ++;
            }else{
                int temp = nums1[t1];
                nums1[t1] = nums2[t2];
                nums2[t2] = temp;
                t1 ++;
                Arrays.sort(nums2);
            }
        }
        for(int i = m;i<m+n;i++){
            nums1[i] = nums2[i-m];
        }
    }
}

