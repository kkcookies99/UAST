 void XXX(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    int p1 = m-1;
    int p2 = n - 1;
    int end = m+n-1;
    while(p1>=0 || p2>=0)
    {
        if(p1>=0 && p2>=0)
        {
            if(nums1[p1]>nums2[p2])
            {
                nums1[end--] = nums1[p1--];
            }
            else
            {
                nums1[end--] = nums2[p2--];
            }
        }
        else if(p2 >= 0)
        {
            nums1[end--] = nums2[p2--];
        }
        else
        {
            return;
        }
    }
}

