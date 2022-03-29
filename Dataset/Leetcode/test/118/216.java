 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> ls=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                 ls.add(1);
                else {
                    ls.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                } 
            }
            list.add(ls);
        }
        return list;
    }
code block

