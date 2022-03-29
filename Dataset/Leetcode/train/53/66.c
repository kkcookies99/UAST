int XXX(int* nums, int numsSize){
	int low=0, move, top=0, cur=0, max=nums[0], last=0, temp;
	
	while(1)
	{
		for(;top<numsSize;top++)  // 去掉开头的负数；同时记录最大值，为了所有数都是负数这一极端情况；
		{
			if(nums[top] > 0)
				break;
			if(max < nums[top])
				max = nums[top];
			low += nums[top];
		}
		if(top == numsSize)  //如果遍历完了，直接返回max，包括全是负数的情况
			return max;
		move=top;  //从正数开始累加
		for(;top<numsSize;top++)
			if(nums[top] < 0)
				break;
		for(;move<top;move++)
			cur += nums[move];
		if(max < cur)
			max = cur;
		if(last == 0)
		{
			last = cur;
			cur = 0;
			low = 0;
		}
		else
		{
			temp = cur + last + low;
			if(temp < cur)
				last = cur;
			else
			{
				last = temp;
				if(max < temp)
					max = temp;
			}
			cur = 0;
			low = 0;
		}
	}
}

