 class Solution {
    public int XXX(String s) {
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int len = 0;
        // 用valid记录重复元素的个数
        int valid = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (window.get(c) > 1) {
                valid++;
            }
            // 如果valid判断放在while循环里，无法处理不含重复元素的s 例如：s = "au";
            if(valid == 0) {
                if (right - left > len) {
                    len = right - left;
                }
            }
            while (valid > 0) {
                char d = s.charAt(left);
                left++;
                if (window.get(d) > 1) {
                    valid--;
                }
                window.put(d, window.getOrDefault(d, 0) - 1);
            }
        }
        return len;
    }
}

