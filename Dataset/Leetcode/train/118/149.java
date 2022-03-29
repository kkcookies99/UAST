 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1 ; i <= numRows ; i++){
            //代表行的数据集合
            List<Integer> numList = new ArrayList<>();
            for(int j = 1 ; j <= i ; j++){
                //表示每行的第一个和最后一个数字固定是 1 
                if( j == 1 || j == i){
                    numList.add(1);
                }else{
                    //代表当前行的某个数值等于前一行（左上角的值） +  右上角的值
                    numList.add(list.get(i-2).get(j-2)+list.get(i-2).get(j-1));
                }
            }
            list.add(numList);
        }
        return list;
    }
}

