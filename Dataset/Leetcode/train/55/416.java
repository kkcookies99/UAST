 class Solution {
    public boolean XXX(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        visited[0] = true;
        for(int i = 0;i < n;i++){
            if(!visited[i]){
                continue;
            }
            for(int j = i + 1;j <= i + nums[i] && j < n;j++){
                if(!visited[j]){
                    visited[j] = true;
                }
            }
        }
        return visited[n - 1];
    }
}

