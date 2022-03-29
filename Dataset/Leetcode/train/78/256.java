class Solution {
public List<List<Integer>> XXX(int[] nums) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        // 先找出除空集外的所有子集
        for (int i = 1; i <= nums.length; i++) {
            backtrack(lists,new ArrayList<>(),nums,0,i);
        }
        // 加空集
        lists.add(new ArrayList<>());
        return lists;
    }


    private void backtrack(List<List<Integer>> lists,List<Integer> temp,int [] nums,int start,int count){
        if(temp.size()==count)
        {
            lists.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(lists,temp,nums,i+1,count);
            temp.remove(temp.size()-1);
        }
    }
}

