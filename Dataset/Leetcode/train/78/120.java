 public List<List<Integer>> XXX(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<Integer>());
        if(nums.length == 0) return list;
        List<Integer> arr = null;
        for(int i = 0; i < nums.length; i++){
            int size = list.size();
            for(int j = 0; j < size; j++){
                arr = new ArrayList<>();
                arr.addAll(list.get(j));
                arr.add(nums[i]);
                list.add(arr);
            }
        }
        return list;
    }
code block

