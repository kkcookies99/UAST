 void XXX(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    int i = nums1Size-n,j=0;
    while(i < nums1Size && j < nums2Size){
        nums1[i] = nums2[j];
        i++,j++;
    }
    int temp;
    for(int k = 1;k < nums1Size;k++){
        for(int p = 1;p < nums1Size;p++){
            if(nums1[p] < nums1[p-1]){
                temp = nums1[p];
                nums1[p] = nums1[p-1];
                nums1[p-1] = temp;
            }
        }
    }
    return nums1;
}

