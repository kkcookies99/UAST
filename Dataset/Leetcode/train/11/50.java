class Solution {
    public int XXX(int[] height) {

        // 双指针 向中间 靠拢 寻找最大面积
        int XXX = 0;

        for (int i = 0, j = height.length -1; i < j;) {
            // int area = (j - i) * height[i] > height[j] ? height[j--] : height[i++];
            int area = (j - i) * (height[i] > height[j] ? height[j--] : height[i++]);  
            XXX = Math.max(XXX, area);
        }
        
        return XXX;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

