 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> resList = new ArrayList<>();
        if(numRows == 0) return resList;
        // 定义杨辉三角中的行数，初始行数☞向-1
        int level = -1;
        // 外循环：进行定位到杨辉三角中的每一行
        for(int i = 0; i < numRows; i++){
            List<Integer> innerList = new ArrayList<>();
            for(int j = 0; j < i + 1; j++){
                // 内循环：求除杨辉三角中每一行的具体元素
                // 如果当前元素为行中第一个或者最后一个 则add(1)
                if(j == 0 || j == i){
                    innerList.add(1);
                }else{ // 否则就开始找到上一个列表中 取出对应两个元素，相加，然后add即可
                    innerList.add(resList.get(level).get(j - 1) + resList.get(level).get(j));
                }
            }
            // 遍历得到一行innerList,就添加到resList中
            resList.add(innerList);
            level++;
        }
        return resList;
    }
}

