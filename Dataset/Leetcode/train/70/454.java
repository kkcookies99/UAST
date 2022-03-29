 public int XXX(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        List<Integer> res = new ArrayList<Integer>();
        res.add(1);
        res.add(2);
        for (int i = 2; i < n; i++) {
            res.add(i,res.get(i - 1) + res.get(i - 2));
        }
        return res.get(n-1);
    }

