 public List<String> XXX(int n) {
        List<String> res = new ArrayList<>();
        handle(res, "(", 1, 0, n);
        return res;
    }

    public void handle(List<String> res, String str, int left, int rigth, int n) {
        if (rigth == n) res.add(str);
        if (left < n) handle(res, str + "(", left + 1, rigth, n);
        if (rigth < left) handle(res, str + ")", left, rigth + 1, n);
    }

