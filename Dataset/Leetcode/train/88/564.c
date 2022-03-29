 void XXX(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n){
    int *nums3=(int *)malloc(sizeof(int)*(m+n));
    int k=0;
    for(int i=0,j=0;;)
    {
        if(i==m)
        {
            for(int p=k;p<m+n;p++)
            {
                    nums3[p]=nums2[j];
                    j++;
            }
            for(int h=0;h<m+n;h++)
            {
                nums1[h]=nums3[h];
            }
            return 0;
        }
        if(j==n)
        {
            for(int p=k;p<m+n;p++)
            {
                nums3[p]=nums1[i];
                i++;
            }
            for(int h=0;h<m+n;h++)
            {
                nums1[h]=nums3[h];
            }
            return 0;
        }
        if(nums1[i]<=nums2[j])
        {
            nums3[k]=nums1[i];
            k++;
            i++;
        }
        else
        {
            nums3[k]=nums2[j];
            k++;
            j++;
        }
    }
}

