 void XXX(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    while(m&&n)nums1[m+n]=nums1[m-1]>nums2[n-1]?nums1[--m]:nums2[--n];
    while(n)nums1[n]=nums2[--n];
}
