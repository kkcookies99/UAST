 class Solution {
    public int XXX(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        s = s.trim();
        String[] strs = s.split(" ");
        return strs[strs.length-1].length();
    }
}

