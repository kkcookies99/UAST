class Solution {
    public int XXX(int n) {
        List<Integer> res = new ArrayList<>();
        if (n < 4) return n;
        
        res.add(0);
        res.add(1);
        res.add(2);
        res.add(3);

        int go = 0;

        for (int i = 4; i <= n; i++) {
            go = res.get(i - 1) + res.get(i - 2);
            res.add(go);
            go = 0;
        }
        return res.get(res.size() - 1);
    }
}```

