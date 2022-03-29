class Solution {
    List<List<Integer>> res =new LinkedList<>();
    public List<List<Integer>> XXX(int[] nums) {
       //记录路径
       LinkedList<Integer> track =new LinkedList<>();
       backtrack(nums,track); 
       return res;  
    }

    private void backtrack(int[] nums,LinkedList<Integer> track) {
      //结束条件 到达叶子节点
      if(track.size() == nums.length){
          res.add(new LinkedList(track));
          return;
      }
      for(int i=0;i<nums.length;i++){
          //排除不合法的选择
          if(track.contains(nums[i])) continue;
          //做选择
          track.add(nums[i]);
          //进入下一层决策树
          backtrack(nums,track);
          //取消选择
          track.removeLast();
      }      
    }
}

