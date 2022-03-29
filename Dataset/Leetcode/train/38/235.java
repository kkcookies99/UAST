class Solution {
    // 双指针
    public String XXX(int n) {
        if (n == 1) {
            return "1";
        }
        String lastStr = XXX(n - 1);
        char[] chars = lastStr.toCharArray();
        int left = 0, right = 1;
        StringBuilder str = new StringBuilder();
        while(right <= chars.length) {
            if (right == chars.length) {
                if (left != right) {
                    str.append(right - left).append(chars[left]);
                }
                break;
            }
            if (chars[right] != chars[left]) {
                str.append(right - left).append(chars[left]);
                left = right;
            }
            right += 1;
        }

        return str.toString();
    }
}

