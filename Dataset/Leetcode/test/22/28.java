  public List<String> XXX(int n) {
        if (n == 0) {
            List<String> res = new ArrayList<>(); 
            res.add("");
            return res;
        }
        if (n == 1) {
            List<String> res = new ArrayList<>(); 
            res.add("()");
            return res;
        }
        List<String> list =  XXX(n - 1);
        for (int i = list.size() - 1; i >= 0; i--) {
            String s = list.remove(i);
            list.add("(" + s + ")");
            String s1 = s + "()", s2 = "()" + s;
            list.add(s1);
            if (!s1.equals(s2)) list.add(s2);
        }
        return list;
    }

