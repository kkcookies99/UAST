 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            List<Integer> list_ = new ArrayList<>();
            for(int j=1; j<=i; j++){
                if(j == 1 || j == i) list_.add(1);
                else{
                    list_.add(list.get(i-2).get(j-2)+list.get(i-2).get(j-1));
                }
            }
            list.add(list_);
        }
        return list;
    }
}

