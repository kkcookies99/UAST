class Solution {
    public void XXX(int[] nums) {

    	int n = nums.length;
    	int zero = -1;
    	int two = n;
    	int i = 0;

    	while (i < two) {

    		if (nums[i] == 1) 
    			i++;
    		else if (nums[i] == 2) 
    			swap(nums, --two, i);
    		else // nums[i] == 0
    			swap(nums, ++zero, i++);
    	}
        
    }

    private void swap(int arr[], int p, int q) {

    	if (p < 0 || p >= arr.length || q < 0 || q >= arr.length)
    		return;

    	int t = arr[p];
    	arr[p] = arr[q];
    	arr[q] = t;
    }
}


