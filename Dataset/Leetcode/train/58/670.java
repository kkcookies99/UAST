 class Solution {
    public int XXX(String s) {
        String[] res = s.split(" ");
        if (res.length == 0) return 0;
        return res[res.length-1].length();
    }
}

