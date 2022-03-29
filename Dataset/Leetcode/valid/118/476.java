 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        if(numRows==0) return res;
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        res.add(list1);
        if (numRows==1) return res;
        List<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(1);
        res.add(list2);
        if (numRows==2 )return res;
        for (int i=3;i<=numRows;i++){
            List<Integer> list = res.get(i - 2);
            List<Integer> addList=new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j==0||j==i-1) {
                    addList.add(1);
                    continue;
                }
                addList.add(list.get(j-1)+list.get(j));
            }
            res.add(addList);
        }
        return res;

    }
}

