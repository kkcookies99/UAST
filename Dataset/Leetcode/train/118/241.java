 class Solution {
    public List<List<Integer>> XXX(int numRows) {

        List<List<Integer>> all = new ArrayList<>();
        for (int i = 0; i < numRows; i ++) {
            if(i == 0) {
                all.add( new ArrayList<Integer>(1){{add(1);}});
                continue;
            }
            ArrayList<Integer> inner = new ArrayList<>(i + 1);
            for(int j = 0; j <= i; j ++) {
                if(j == 0 || j == i) {
                    inner.add(1);
                }else{
                    List<Integer> old = all.get(i - 1);
                    inner.add(old.get(j) + old.get(j - 1));
                }
            }
            all.add(inner);
        }
        return all;        
    }
}

