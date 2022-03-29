 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        //处理行数为0
        if(numRows==0) return res;
        //处理行数为1
        res.add(Arrays.asList(1));
        //处理剩余从下标1开始
        for(int i = 1;i<numRows;i++){
            //创建新行数据
            List<Integer> current = new ArrayList<>();
            //获取前一行数据
            List<Integer> pre = res.get(i-1);
            //每行开头都为1
            current.add(1);
            //循环当前行 0已经处理过从下标1开始 j为本行游标 i为本行数
            for(int j = 1;j < i;j++){
                current.add(pre.get(j-1)+pre.get(j));
            }
            //每行结尾都为1
            current.add(1);
            //本行加入总集合
            res.add(current);
        }
        return res;
    }
}


