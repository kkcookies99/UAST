 class Solution {
    public int XXX(String s) {
        String[] ss = s.replaceAll("\\s+", ",").split(",");
        return ss[ss.length - 1].length();
    }
}

