 public void XXX(int[] nums1, int m, int[] nums2, int n) {      
    int length = m + n - 1;
    int n2Index = n - 1;
    while(n2Index >= 0){
        if(m == 0){
            nums1[n2Index] = nums2[n2Index--];
        }else{
           if(nums1[m - 1] < nums2[n2Index]){
                nums1[length] = nums2[n2Index--];
            }else if(nums1[m - 1] > nums2[n2Index]){
                nums1[length] = nums1[m - 1];
                nums1[m-- - 1] = nums2[0];
            }else{
                nums1[length] = nums2[n2Index--];
            }
        }
       length--;
    }
}
