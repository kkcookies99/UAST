 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < numRows; ++i){
            Integer[] tmp = new Integer[i + 1];
            for(int h = 0; h < i + 1; ++h){ tmp[h] = 1; }
            List<Integer> ls = new ArrayList<>(Arrays.asList(tmp));
            if(i > 0){
                for(int j = 1; j < (i / 2) + 1; ++j){
                    int pos = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                    ls.set(j, pos);
                    ls.set(i - j, pos);
                }
            }
            res.add(ls);            
        }

        return res;
    }
}

