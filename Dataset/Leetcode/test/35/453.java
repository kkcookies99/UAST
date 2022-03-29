 class Solution {
    public int XXX(int[] nums, int target) {
        int low = 0; 
	int high = nums.length - 1; 
        
        if(target < nums[low])
            return low;
        if(target > nums[high])
            return nums.length;
		
        while(low <= high) {
		int middle = (low + high) / 2;
			
		if (target == nums[middle]) {
			return middle; 
		}else if (target > nums[middle]) {
			low = middle + 1;
		}else {
			high = middle - 1;
		}
	}
	return -1;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


