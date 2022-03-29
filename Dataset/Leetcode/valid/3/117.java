 class Solution {
    public int XXX(String s) {
        // 设置左右两个指针表示滑动窗口
        int left = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            // 滑动窗口的右指针是当前下标+1
            int right = i + 1;
            String subStringLeft = s.substring(left, i);
            String currentChar = s.substring(i, i + 1);
            // 如果滑动窗口内有重复元素就更新右坐标
            while (subStringLeft.contains(currentChar)) {
                left++;
                subStringLeft = s.substring(left, i);
            }
            String subString = s.substring(left, right);
            maxLength = Math.max(maxLength, subString.length());
        }
        return maxLength;
        }
}

