     public List<String> XXX(int n) {
        List<String> dp = new ArrayList<>();
        List<String> updateDp = new ArrayList<>();
        dp.add("");
        if (n > 0) dp.set(0, "()");
        for (int i = 2; i <= n; i++) {
            for (String s : dp) {
                updateDp.add("(" + s + ")");
                String s1 = s + "()", s2 = "()" + s;
                updateDp.add(s1);
                if (!s1.equals(s2)) updateDp.add(s2);
            }
            List<String> t = updateDp;
            updateDp = dp;
            dp = t;
            updateDp.clear();
        }
        return dp;
    }

