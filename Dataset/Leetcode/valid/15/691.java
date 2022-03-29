 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        // 深度优先遍历
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int len = nums.length;
        int sum = 0;
        Arrays.sort(nums);
        boolean[] visited = new boolean[len];

        dfs(list,path,0,len,sum,visited,nums);
        return list;
    }


    public void dfs(List<List<Integer>> list,List<Integer> path,int begin,int len,int sum,boolean[] visited,int[] nums){
        if(sum==0&&path.size()==3){
            list.add(new ArrayList<>(path));
            return ;
        }
        
        if(path.size()>3) return;

        for(int i=begin;i<len;i++){
            if(visited[i]) continue;
            if(i>0&&nums[i]==nums[i-1]&&!visited[i-1]) continue; // 去重
            else{
                path.add(nums[i]);
                visited[i] = true;


                dfs(list,path,i,len,sum+nums[i],visited,nums);

                visited[i] = false;
                path.remove(path.size()-1);
            }
            
        }

    }
}

