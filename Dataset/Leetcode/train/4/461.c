 double XXX(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int i,j,nums,exch;
	double val;
	int size = 0;
	nums = nums1Size + nums2Size;
	int num[nums];
	for(i=0;i<nums1Size;i++)
	{
		num[size] = nums1[i];
		size++;
	}
	for(i=0;i<nums2Size;i++)
	{
		num[size] = nums2[i];
		size++;
	}
	
	for(i=0;i<nums;i++)
	{
		for(j=i+1;j<nums;j++)
		{
			if(num[i] > num[j])
			{
				exch = num[i];
				num[i] = num[j];
				num[j] = exch;
			}
		}
	}
    for(i = 0;i<nums;i++)
    {
        printf("%d ",num[i]);
    }

	if(nums%2 == 0)
	{
		val = (*(num+nums/2)+*(num+nums/2-1))/2.0;
	}
	else
		val = *(num+nums/2)/1.0;
	return val;
}

