 void XXX(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
int i=m-1,j=n-1,k=nums1Size-1;
for(;k>=0;k--){
    if(i>=0&&j>=0)
    nums1[k]=nums1[i]>nums2[j]?nums1[i--]:nums2[j--];
    else if(j>=0) nums1[k]=nums2[j--];
    else break;
}
}

