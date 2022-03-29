class Solution {
    public List<List<Integer>> XXX(int[] nums) {
        // 全排列问题：经典的暴力递归
        List<List<Integer>> re = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();// 创建数组用于保存路径
        process(nums,re,0,temp);
        return re;
    }
    //传入数组，实现全排列过程 i表示索引位置
    public void process(int[] nums,List<List<Integer>> re,int i,ArrayList<Integer> temp){
        if(nums.length == i){
            re.add(new ArrayList<>(temp));
            return;
        }
        //剪枝
        //判断一个数字是否add过
        //判断
        for(int j = i;j < nums.length;j++){
            //从第i位开始，i后面的都可以与i交换位置
            swap(nums,i,j);
            temp.add(nums[i]);
            process(nums,re,i+1,temp);
            swap(nums,i,j);
            temp.remove(temp.size() - 1);
        }
    }
    public void swap(int [] ints,int i,int j){//交换两个元素位置
        int temp = ints[i];
        ints[i] = ints[j];
        ints[j] = temp;
    }
}

