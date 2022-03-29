 class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        //回溯法
        //1. 定义x[]数组记录每个位置是否选取（2为选，1为不选）
        //2. 从nums[0]位置开始回溯法，构建 解空间树
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int[] x = new int[nums.length];
        backTrack(0, nums, x, list);
        return list;
    }
    
   /*
    * 1. 若 t超过了数组大小，即达到了 解空间树 的叶子结点，根据 x[]数组情况将元素
    *    添加到子集合 arr中，再将 arr添加到最终集合 list中
    * 2. 若 t 没有超过数组大小，分两种情况
    *   (1) x[t] 赋值为 1， 表示不选该元素。同时，递归实现之后的 解空间树
    *   (2) x[t] 赋值为 2， 表示选该元素。同时，递归实现之后的 解空间树   
    * */
    public void backTrack(int t, int[] nums, int[] x, List<List<Integer>> list){
        // 1. t 超过了数组大小，输出解
        if(t == nums.length){
            List<Integer> arr = new ArrayList<>();
            for(int i = 0; i < nums.length; i++){
                if(x[i] == 2) arr.add(nums[i]);
            }
            list.add(arr);
        // 2. t 未超过数组大小，分两种情况赋值，并构建之后的解空间树
        }else{
            x[t] = 1; backTrack(t + 1, nums, x, list);
            x[t] = 2; backTrack(t + 1, nums, x, list);
        }

    }
}

