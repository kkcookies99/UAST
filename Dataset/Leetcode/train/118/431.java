 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        //初始化第1行和第2行
        if(numRows>0){
            List<Integer> subList = new ArrayList<>();
            subList.add(1);
            res.add(subList);
            if(numRows>1){
                List<Integer> subList1 = new ArrayList<>();
                subList1.add(1);
                subList1.add(1);
                res.add(subList1);
            }
        }
        //第3行以后用for循环来赋值
        for(int i=2;i<numRows;i++){
            List<Integer> subRes = new ArrayList<>();
            subRes.add(1);
            List<Integer> lastList = res.get(i-1);
            for(int j=1;j<i;j++){
                int a = lastList.get(j-1)+lastList.get(j);
                subRes.add(a);
            }
            subRes.add(1);
            res.add(subRes);
        }
        return res;
    }
}

