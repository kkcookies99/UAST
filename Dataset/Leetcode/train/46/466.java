 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
       List<List<Integer>> list = new ArrayList();
       arrange(list, nums,0,nums.length);
       return list;
    }

    public void arrange(List<List<Integer>> list, int[] nums,int start,int end) {
        if(start == end) {
            List<Integer> item = new ArrayList<Integer>();
            for(int i = 0; i<nums.length;i++) {
                item.add(nums[i]);
            }
            list.add(item);
        } else {
            for (int i = start;i< end; i++) {
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                arrange(list,nums,start+1,end);
                temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
            }
        }

    }
}

