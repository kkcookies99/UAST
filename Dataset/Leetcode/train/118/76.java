 class Solution {
    public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> r = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(1);
        r.add(l);
        if(numRows==1) return r;
        l = new ArrayList<>();
        l.add(1);
        l.add(1);
        r.add(l);
        if(numRows==2) return r;
        for(int i=0;i<numRows-2;i++){
            List<Integer> t = new ArrayList<>();
            t.add(1);
            for(int j=0;j<l.size()-1;j++){
                t.add(l.get(j)+l.get(j+1));
            }
            t.add(1);
            l = t;
            r.add(l);
        }
        return r;
    }
}

