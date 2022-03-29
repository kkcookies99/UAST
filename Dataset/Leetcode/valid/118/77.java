 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>>list=new ArrayList<>();
       // list.add(new List<Integer>(1)=);
        if(numRows==0)
            return list;
        list.add(new ArrayList<>());
        list.get(0).add(1);
        for(int i=1;i<numRows;i++)
        {
            //左
            List<Integer>ll=new ArrayList<>();
            ll.add(1);
            for(int j=1;j<=i-1;j++)
            {
                ll.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            //右
            ll.add(1);
            list.add(ll);
        }
        return list;
    }
}

