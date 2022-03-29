 class Solution {
    public int XXX(String s) {
        int index = 0;
        int len = 0;
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) {
            //将对应字符及其索引放进去
            if(!hashtable.containsKey(s.charAt(i))) {
                hashtable.put(s.charAt(i), i);
            }else {
                len = Math.max(len, i - index);
                int l = hashtable.get(s.charAt(i));
                index = l + 1;
                hashtable.clear();
                int m = index;
                while(m <= i) {
                    hashtable.put(s.charAt(m), m);
                    m++;
                }
            }
        }
        return Math.max(len, s.length() - index);
    }
}

