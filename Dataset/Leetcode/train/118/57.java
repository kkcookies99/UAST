 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> f = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if(j>0&&j<i){
                    f.add(temp.get(j-1)+temp.get(j));
                }else{
                    f.add(1);
                }
            }
            result.add(f);
            temp=f;
        }
        return result;
    }
}

