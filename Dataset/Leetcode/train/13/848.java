 class Solution {
    public int XXX(String s) {
        LinkedHashMap<String,Integer> lp = new LinkedHashMap();
        StringBuilder sb = new StringBuilder(s);
        int res = 0;
        lp.put("M", 1000);
        lp.put("CM", 900);
        lp.put("D", 500);
        lp.put("CD", 400);
        lp.put("C", 100);
        lp.put("XC", 90);
        lp.put("L", 50);
        lp.put("XL", 40);
        lp.put("X", 10);
        lp.put("IX", 9);
        lp.put("V", 5);
        lp.put("IV", 4);
        lp.put("I", 1);
        int i = 0;
        for (String key : lp.keySet()) { 
            int len = key.length();
            while(i + len <= sb.length() && key.equals(sb.substring(i, i + len))) {
                res += lp.get(key);
                i += len;
            }
        }
        return res;
    }
}

