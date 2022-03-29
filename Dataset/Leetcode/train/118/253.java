 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        if(numRows<1 || numRows>30) return null;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> L0 = new ArrayList<>();
        L0.add(1);
        res.add(L0);
        if(numRows == 1) return res;
        List<Integer> L1 = new ArrayList<>();
        L1.add(1);
        L1.add(1);
        res.add(L1);
        List<Integer> Lx_1 = L1;
        for(int i = 2; i < numRows; i++){
            List<Integer> Lx = new ArrayList<>();
            Lx.add(1);
            for(int j = 0; j < i-1; j++){
                Lx.add(Lx_1.get(j)+Lx_1.get(j+1));
            }
            Lx.add(1);
            Lx_1 = Lx;
            res.add(Lx);
        }
        return res;
    }
}

