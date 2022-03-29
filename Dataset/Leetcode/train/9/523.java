 class Solution {
    public boolean XXX(int x) {
        String s = String.valueOf(x);
        if (s == null || s.length() == 0)
            return false;
        return dfs(s, 0, s.length() - 1);
    }

    private static boolean dfs(String s, int start, int end) {
        if (s.charAt(start) != s.charAt(end))
            return false;
        if (start >= end)
            return true;
        return dfs(s, start + 1, end - 1);
    }    
}

