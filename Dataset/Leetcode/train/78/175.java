class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> XXX(int[] nums) {

        int n = nums.length;
        /**
        回溯：求所有可能的子集

        在子集中，每个数组元素有两种情况：存在或不存在子集中
        第一个元素存在或是不存在并不影响下一个元素

        例如1 2 ，子集有四种可能
        1 不存在 2 不存在
        1 存在   2 不存在
        1 不存在  2 存在
        1 存在。  2 存在

        所以子集的数量 = 2的n次方

        使用dfs的方式遍历所有解
         */
        
        List<Integer> list = new ArrayList<>();
        trackback(nums,0,list);
        return ans;
    }
    public void trackback(int[] nums,int count,List<Integer> list){

        //当前子集已经包含所有元素的一种情况
        if(count == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        //当前子集不存在nums[count]元素的情况
        trackback(nums,count+1,list);

        //当前子集存在nums[count]元素的情况
        list.add(nums[count]);
        trackback(nums,count+1,list);
        list.remove(list.size()-1);
    }
}

