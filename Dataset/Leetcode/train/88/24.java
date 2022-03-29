 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        //逆向双指针法
        int p1 = m - 1;     //p1指针在nums1上扫描
        int p2 = n - 1;     //p2指针在nums2上扫描
        for(int i=nums1.length-1; i>=0; i--){
            if     (p1 < 0)                 {nums1[i] = nums2[p2];  p2--;}
            else if(p2 < 0)                 {nums1[i] = nums1[p1];  p1--;}
            else if(nums1[p1] < nums2[p2])  {nums1[i] = nums2[p2];  p2--;}
            else if(nums1[p1] >= nums2[p2]) {nums1[i] = nums1[p1];  p1--;}
        }
    }
}

