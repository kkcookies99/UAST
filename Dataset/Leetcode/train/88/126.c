 void XXX(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    int i, j;
    for (j = 0; j < nums2Size; j++)
    {    
        for (i = m-1 + j; i >= 0; i--)
        {
            if (nums2[j] < nums1[i])
                nums1[i + 1] = nums1[i];
            else
                break;
        }
        nums1[i + 1] = nums2[j];
    }
}

