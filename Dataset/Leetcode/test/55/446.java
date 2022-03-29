 class Solution {
    public boolean XXX(int[] nums) {
        if(nums[0] == 0){
            return nums.length == 1;
        }
        return dfs(nums, 0, new boolean[nums.length]);
    }

    private boolean dfs(int[] nums, int loc, boolean[] visited){
        if(loc >= nums.length - 1){
            return true;
        }else{
            boolean flag = false;
            visited[loc] = true;
            for(int i = nums[loc]; i >= 1; i--){
                if(loc + i >= nums.length - 1 || !visited[loc + i]){
                    flag = dfs(nums, loc + i, visited);
                    if(flag){
                        return true;
                    }
                }
            }
            return false;
        }
    }
}

