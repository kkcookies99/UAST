 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int m = 0;
        List<Integer> list2 = null;
        while(numRows > 0){
            numRows --;
            m ++;
            List<Integer> list1 = new ArrayList<>();
            for(int i = 0 ; i < m ; i ++){
                if(i == 0 || i == m - 1){
                    list1.add(1);
                }else{
                    list1.add(list2.get(i) + list2.get(i - 1));
                }
            }
            list2 = list1;
            list.add(list1);
        }
        return list;
    }
}

