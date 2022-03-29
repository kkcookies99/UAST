 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if(numRows == 0){
            return lists;
        }
        List<Integer> pre;
        List<Integer> list = new ArrayList<>(); 
        list.add(1);
        lists.add(list);
        int len = 2;
        while(len <= numRows){
            pre = list;
            list = new ArrayList<>();  
            for(int i = 0; i < len; i++){
                if(i == 0){
                    list.add(1);
                }else if(i == len - 1){
                    list.add(1);
                }else{
                    list.add(pre.get(i) + pre.get(i - 1));
                }
            }
            lists.add(list);
            len++;
        }
        return lists;
    }
}

