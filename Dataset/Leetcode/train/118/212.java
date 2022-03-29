 class Solution {
    public List<List<Integer>> XXX(int numRows) {
       
        List<List<Integer>> lists = new ArrayList<>();
        for (int i=1;i<=numRows;i++){

            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j=1;j<i-1;j++){
                list.add(lists.get(i-2).get(j-1)+lists.get(i-2).get(j));
            }
            if(i!=1){
                list.add(1);//index = i-1
            }

            lists.add(list);
        }

        return lists;
    }
}

