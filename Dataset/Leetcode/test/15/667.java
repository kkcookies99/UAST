 class Solution {
    //先排序，然后固定一个，其他两个用双指针
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> a = new ArrayList<>();
        //从小到大排序
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                while(nums[i] + nums[j] + nums[k] < 0 && j<k) {
                    j++;
                }
                while(nums[i] + nums[j] + nums[k] > 0 && j<k) {
                    k--;
                }
                if(nums[i] + nums[j] + nums[k] == 0 && j<k) {
                    a.add(new ArrayList(Arrays.asList(nums[i],nums[j],nums[k])));
                    //去除重复三元组
                    while(j<k && nums[j] == nums[++j]);
                    while(j<k && nums[k] == nums[--k]);
                }
            }
        }
        return a;
    }
}

