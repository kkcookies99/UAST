class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums==null||nums.length==0) return list;
        Arrays.sort(nums);
        while(true) {
			list.add(Arrays.asList(toInteger(nums)));
			int i = nums.length-2;
			while(i >= 0 && nums[i] >= nums[i+1]) i--;
			if(i<0) break;
			int j = i + 1;
			while(j < nums.length-1 && nums[j+1]>nums[i]) j++;
			swap(nums,i,j);
			reverse(nums,i+1,nums.length-1);
		}
        return list;
    }
    public Integer[] toInteger(int[] arr){
        Integer[] cov = new Integer[arr.length];
        for(int i = 0; i < arr.length; i++){
            cov[i] = arr[i];
        }
        return cov;
    }
    public void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public void reverse(int[] arr,int l, int r) {
		while(l<r) {
			int temp = arr[l];
			arr[l++] = arr[r];
			arr[r--] = temp;
		}
	}
}

