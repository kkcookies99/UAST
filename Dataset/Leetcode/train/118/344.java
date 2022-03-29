 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        //如果为0，则直接返回一个空的
        if(numRows == 0) return res;
        //不为0,则放入1
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        res.add(list1);
        if(numRows == 1) return res;
        //numRows为2个的情况
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        res.add(list2);
        if(numRows == 2) return res;
        //numRows最少有3个
        List<Integer> temp = new ArrayList<>();
        temp = list2;
        /**
        * 因为前面已经添加了2个，所以在这遍历numRows - 2
        *每次遍历，第一个都是1
        *然后从第二个开始，每一个都等于temp的前一个+当前的值
        *当遍历到最后一个的也就是temp的长度，添加1
        */
        for(int i = 0; i < numRows - 2;i++ ){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for(int j = 1;j < temp.size() + 1; j++){
                if(j == temp.size()){
                    list.add(1);
                }else{
                    list.add(temp.get(j - 1) + temp.get(j));
                }
            }
            temp = list;
            res.add(list);
        }
        return res;
    }
}

