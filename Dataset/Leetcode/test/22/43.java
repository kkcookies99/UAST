 public List<String> XXX(int n) {
        List<String> res = new ArrayList<>();
        force(n, n, "", res);
        return res;
    }

    private static void force(int l, int r, String s, List<String> res) {
        if (l > r || l < 0)
            return;
        if (r == 0)
            res.add(s);
        force(l - 1, r, s + "(", res);
        force(l, r - 1, s + ")", res);
    }

