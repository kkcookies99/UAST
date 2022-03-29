 public int XXX(int[] nums, int target) {
        int first = 0;
		int last = nums.length - 1;
		int mid = 0;
        
		while(first < last){
			mid = (first + last)/2;
			if(nums[mid] < target){
				first = mid + 1;
			}else if(nums[mid] > target){
				last = mid - 1;
			}else{
				return mid;
			}
		}
        
		if(nums[first] < target)
			return (first+1);
		else
			return first;
    }

