class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        allSort(ans, nums, new int[nums.length], 0);
        return ans;
    }

    public void allSort(List<List<Integer>> ans, int[] nums, int[] temp, int now){
        if(now == nums.length){
            List<Integer> add = new ArrayList<>();
            for(int i = 0; i < now; i++)
                add.add(temp[i]);
            ans.add(add);
            return;
        }
        temp[now] = nums[now];
        if(now == 0)
            allSort(ans, nums, temp, 1);
        else{
            for(int i = 0; i <= now; i++){
                int a0 = temp[0];
                for(int j = 0; j < now; j++)
                    temp[j] = temp[j + 1];
                temp[now] = a0;
                int[] old = temp.clone();
                allSort(ans, nums, temp, now + 1);
                temp = old;
            }
        }
    }
}

