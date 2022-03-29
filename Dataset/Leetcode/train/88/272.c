 void XXX(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    
    int lenth = m + n - 1;
    while ((m > 0) || (n > 0))
    {   
        if (m == 0)
        {
            nums1[lenth] = nums2[n - 1];
            n--;
            lenth--;
        }
        else if(n == 0)
        {
            nums1[lenth] = nums1[m - 1];
            m--;
            lenth--;
        }     
        else if (nums1[m - 1] >= nums2[n - 1])
        {
            nums1[lenth] = nums1[m - 1];
            m--;
            lenth--;
        }
        else
        {
            nums1[lenth] = nums2[n - 1];
            n--;
            lenth--;
        }
    }
}

