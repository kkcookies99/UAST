int singleNumber(int* nums, int numsSize){
	int count[2*MAXSIZE]={0};
    int i;

	for(i=0;i<numsSize;i++)
		count[nums[i] + MAXSIZE]++;
	
	for(i=0;i<2*MAXSIZE;i++)
		if(count[i]==1)
			break;	
	return i-MAXSIZE;
}

