class Solution {
    List<List<Integer>> res = new ArrayList<>();
    int[] arr;

    public List<List<Integer>> XXX(int[] nums) {
        //将数组存储为成员变量
        arr = nums;
        //保存子集
        List<Integer> list = new ArrayList<>(nums.length);
        
        //先将空集添加到结果中
        res.add(new ArrayList(list));
        //然后深度优先搜索
        dfs(0,list);
        return res;
    }

    //深度优先遍历
    private void dfs(int now,List<Integer> list){
        for(int i=0;i+now<arr.length;i++){
            list.add(arr[i+now]);
            res.add(new ArrayList(list));
            dfs(i+now+1,list);
            list.remove(list.size()-1);
        }
    }
}

