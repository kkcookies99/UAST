class Solution {
    /**
    递归思路:由题意输出可得出规律 输入[1,2,3]
    开始为[]，遍历数组 每次都复制上一次数组 将遍历的值加到复制数组中去 流程如下
    第一次[]
    第二次[] [1] （数组下标为0 值为1）
    第三次[] [1] [2] [1,2] （数组下标为1 值为2）
    第四次[] [1] [2] [1.2] [3] [1,3] [2,3] [1.2,3] （数组下标为2 值为3）
     */
    public List<List<Integer>> XXX(int[] nums) {
        //最终集合res 类型为 List<List<Integer>>返回
        List<List<Integer>> res = new ArrayList<>();
        //开始集合为空[]
        res.add(new ArrayList<Integer>());
        //遍历nums
        for (int num : nums) {
            //创建临时集合空间
            List<List<Integer>> temp = new ArrayList<>();
            for (List<Integer> re : res) {
                //遍历结果集 将结果集进行复制
                List<Integer> temp1 = new ArrayList<>(re);
                //复制的集合加到num
                temp1.add(num);
                //最后将复制后的结果加到临时集合中
                temp.add(temp1);
            }
            //将临时集合添加到最终集合中
            res.addAll(temp);
             }
        return res;

    }
}

