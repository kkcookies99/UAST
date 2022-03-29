class Solution {
    public int XXX(int[] height) {
    int ans = -1;
    int p1 = 0, p2 = height.length - 1;
    while (p1 < p2) {
        if (height[p1] < height[p2] && p1 < height.length && p2 > -1) {
            ans = Math.max((p2 - p1) * height[p1], ans);
            p1++;
        } else {
            ans = Math.max((p2 - p1) * height[p2], ans);
            p2--;
        }
    }
    return ans;
    }
}

