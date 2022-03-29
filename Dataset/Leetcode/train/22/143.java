 class Solution {
    List<String> ans = new LinkedList<>();
    StringBuilder path = new StringBuilder();
    public List<String> XXX(int n) {
        tracingBack(0, 0, n);
        return ans;
    }
    private void tracingBack(int left, int right, int n) {
        if(left == n && right == n) {
            ans.add(path.toString());
        }
        if(left < n) {
            path.append('(');
            tracingBack(left + 1, right, n);
            path.deleteCharAt(path.length() - 1);

        }
        if(right < left) {
            path.append(')');
            tracingBack(left, right + 1, n);
            path.deleteCharAt(path.length() - 1);

        }
    }
}

