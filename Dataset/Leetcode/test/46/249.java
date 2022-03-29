class Solution {
    private List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> XXX(int[] nums) {
        int[] mark = new int[nums.length+1];
        List<Integer> temp = new LinkedList<>();
        func(nums,mark,temp);
        return res;
    }
    // 计算全排列的数组 标记数组 临时数组
    public void func(int[] nums, int[] mark,List<Integer> temp){
        // 结束递归条件
        if (temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0;i<nums.length;i++){
            if (mark[i] == 1){
                continue;
            }
            temp.add(nums[i]);
            mark[i] = 1;
            func(nums,mark,temp);
            temp.remove(temp.size()-1);
            mark[i] = 0;
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


