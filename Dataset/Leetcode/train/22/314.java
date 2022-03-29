      public List<String> XXX(int n) {
        List<String> list = new ArrayList<>();

        backtrack(list, "", n, 0, 0);

        return list;
    }

    public void backtrack(List<String> list, String str, int n, int left, int right) {
        if (left == right && left == n) list.add(str);
        if (left < right) return;
        if (left < n) backtrack(list, str + "(", n, left + 1, right);
        if (right < n) backtrack(list, str + ")", n, left, right + 1);
    }

