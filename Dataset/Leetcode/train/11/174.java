class Solution {
    public int XXX(int[] height) {
        int max = 0;
        int i = 0, j = height.length - 1;
        int left;
        int right;
        // 从左右两端往中间找，每次移动的都是短板 并且每次计算一次容量
        while (i < j) {
            left = height[i];
            right = height[j];
            max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            if (left < right) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}```

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

