 class Solution {
    public void XXX(int[] nums1, int m, int[] nums2, int n) {
        int l1 = m-1, l2 = n-1, l3 = m+n-1; 
        while(l1 >= 0 || l2 >= 0){
            if(l2 < 0){
                break;
            }
            else if(l1 < 0){
                nums1[l3--] = nums2[l2--];
            }
            else {
                nums1[l3--] = (nums1[l1] > nums2[l2]) ? nums1[l1--] : nums2[l2--];
            }   
        }
    }
}

