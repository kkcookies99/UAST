 class Solution {
    public List<String> XXX(int n) {
        List<String> ans = new ArrayList<>();
        int[] nums = new int[2*n];
        nums[0] = -1;
        int left = n - 1;
        int right = n;
        dfs(nums,-1,1,left,right,ans);
        return  ans;
    }

    public static void dfs(int[] nums,int sum,int index,int left,int right,List<String> ans){
        if(sum > 0){
            return;
        }
        if(index == nums.length && left == 0 && right == 0){
            StringBuilder sb = new StringBuilder();
            for(int i : nums){
                if(i == -1) sb.append("(");
                if(i == 1) sb.append(")");
            }
            ans.add(sb.toString());
            return;
        }
        if(left > 0){
            nums[index] = -1;
            dfs(nums,sum-1,index+1,left-1,right,ans);
            nums[index] = 0;
        }
        if(right > 0){
            nums[index] = 1;
            dfs(nums,sum+1,index+1,left,right - 1,ans);
            nums[index] = 0;
        }
    }
}

