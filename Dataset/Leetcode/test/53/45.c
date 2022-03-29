int XXX(int* nums, int numsSize){
	int i,max,sum;
	max = nums[0];
	sum = 0;
	for(i=0;i<numsSize;i++){
		if(sum < 0){
			sum = nums[i];
		}
		else{
			sum = sum + nums[i];
		}	
		if(sum > max){
			max = sum;
		}
	}
	return max;
}

