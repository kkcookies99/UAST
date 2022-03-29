class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> s = new ArrayList<>();
        dfs(nums,s);
        return list;
    }

    private void dfs(int[] nums, List<Integer> t){
        if(t.size() == nums.length){
            list.add(new ArrayList<>(t));
            return;
        }

        for(int j = 0; j < nums.length; j++){
            if(!t.contains(nums[j])) {
                t.add(nums[j]);
                dfs( nums, t);
                t.remove(t.size() - 1);
            }
        }
    }
}

class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> XXX(int[] nums) {
        List<Integer> s = new ArrayList<>();
        boolean visits[] = new boolean[nums.length];
        dfs(nums,s,visits);
        return list;
    }

    private void dfs(int[] nums, List<Integer> t,boolean[] visits){
        if(t.size() == nums.length){
            list.add(new ArrayList<>(t));
            return;
        }

        for(int j = 0; j < nums.length; j++){
            if(!visits[j]) {
                visits[j] = true;
                t.add(nums[j]);
                dfs( nums, t,visits);
                t.remove(t.size() - 1);
                visits[j] = false;
            }
        }
    }
}

