 void XXX(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    while(nums1Size--)
        if(!n || (m && nums1[m - 1] >= nums2[n - 1])) nums1[nums1Size] = nums1[--m];
        else nums1[nums1Size] = nums2[--n];
}

