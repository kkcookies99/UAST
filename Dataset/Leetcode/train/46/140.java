public List<List<Integer>> XXX(int[] nums) { 
        List<List<Integer>> list = new ArrayList<>();
        if(nums.length == 0) return list;
        process(nums, 0, list);
        return list;
    }
    
    public void process(int[] nums, int i, List<List<Integer>> list){
        if(i == nums.length){
        	List<Integer> arr = new ArrayList<>();
           for(Integer item : nums)
        	   arr.add(item);
           list.add(arr);
            return;
        }
        for(int j = i; j < nums.length; j++){
            swap(nums, j, i);
            process(nums, i+1, list);
            swap(nums, i, j);
        }
    }
    public void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
code block

