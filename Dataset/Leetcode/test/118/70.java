 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();//存放结果
        int n=0;//行的个数
        while(n<=numRows-1){
            List<Integer> row   = new ArrayList<>();//存储每一行
            for(int i=0;i<=n;i++){//处理每一行
                if(i==0 || i==n){//判断是否为首尾
                    row.add(1);
                }else{
                    //非首尾元素，等于上一行i-1和i位置的数值的和
                    row.add(res.get(n-1).get(i-1)+res.get(n-1).get(i));
                }
            }
            res.add(row);//将该行加入res
            n++; //切换下一行           
        }
        return res;

    }
}

