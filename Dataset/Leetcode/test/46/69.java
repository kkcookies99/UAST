class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(frac(nums.length));

        LinkedList<Integer> list = new LinkedList<>();
        list.add(nums[0]);
        result.add(list);

        for(int i = 1; i < nums.length; ++i){
            int count = result.size();
            for (int k = 0; k < count; ++k){
                int size = result.get(k).size();
                for (int index = 0; index < size; ++index){
                    LinkedList<Integer> listTemp = new LinkedList<>(result.get(k));
                    listTemp.add(index, nums[i]);
                    result.add(listTemp);
                }
                result.get(k).add(nums[i]);
            }
        }
        return result;
    }

    private int frac(int n){
        if (n <= 1){
            return  1;
        }
        return n*frac(n-1);
    }    
}

