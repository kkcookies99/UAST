 public List<String> XXX(int n) {
        List<List<String>> result = new ArrayList<>();
        ArrayList<String> r1 = new ArrayList<>();
        r1.add("()");
        result.add(r1);
        for (int i = 1; i < n; i++) {
            HashSet<String> set = new HashSet<>();
            List<String> z = result.get(i - 1);
            for (String s : z) {
                for (int j = 0; j < s.length(); j++) {
                    set.add(s.substring(0, j) + "()" + s.substring(j));
                }
            }
            ArrayList<String> rs = new ArrayList<>(set);
            result.add(rs);
        }
        return result.get(n - 1);
    }

