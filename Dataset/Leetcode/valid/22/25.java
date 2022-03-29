 class Solution {
    List<String> result = new ArrayList<>();

    public List<String> XXX(int n) {
        char[] chars = new char[2 * n];
        backTrack(chars, 0, n, n);
        return result;
    }

    // 记录左括号和右括号的个数
    public void backTrack(char[] chars, int index, int left, int right) {
        // 用来保证括号添加的正确性
        if (right < left) return;
    
        if (left == 0 && right == 0) {
            result.add(new String(chars));
            return;
        }
        if (left != 0) {
            chars[index] = '(';
            backTrack(chars, index + 1, left - 1, right);
        }
        if (right != 0) {
            chars[index] = ')';
            backTrack(chars, index + 1, left, right - 1);
        }
    }
}

