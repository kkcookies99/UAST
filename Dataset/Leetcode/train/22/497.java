 class Solution {
    public List<String> XXX(int n) {
        List<String> res = new ArrayList<String>();
        String td;
        if (n == 1) {
            res.add("()");
            return res;
        }
        List<String> sub = XXX(n - 1);
        String td1;
        for (int j = 0; j < sub.size(); j++) {
            for (int i = 0; i < sub.get(j).length(); i++) {
                td = sub.get(j);
                if (i == 0) td = "()" + td;
                else if (i <= sub.get(j).length() - 1) td = td.substring(0, i) + "()" + td.substring(i);
                else td += "()";
                if (!res.contains(td)) res.add(td);
                td1 = sub.get(j);
                td = td1;
            }
        }
        return res;
    }
}

