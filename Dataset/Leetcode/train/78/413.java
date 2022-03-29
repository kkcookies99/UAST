     public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        helper(lists,nums,new Integer[nums.length],0,0);
        return lists;
    }
    void helper(List<List<Integer>> lists,int[] nums,Integer[] temp,int i , int k){
        if(k > nums.length){
            return;
        }
        lists.add(Arrays.asList(Arrays.copyOf(temp,k)));
        for(; i < nums.length ;i++){
            temp[k] = nums[i];
            helper(lists,nums,temp,i+1,k+1);
        }
    }

