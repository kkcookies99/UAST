 class Solution {
        List<String> list = new ArrayList<>();
    public List<String> XXX(int n) {
        generatehesis(n,"",0,0);
        return list;
    }

    public void generatehesis( int n, String s, int l, int r) {
        if (s.length() == n << 1) {
            list.add(s);
            return;
        }
        if (r < n) generatehesis( n, s + "(", l, r+1);
        if (l < r) generatehesis( n, s + ")", l+1, r);
    }
}

