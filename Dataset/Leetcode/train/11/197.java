class Solution {
    public int XXX(int[] height) {
        int i = 0;
        int j = height.length-1;
        int waters = Integer.min(height[i], height[j]) * (j - i);
        while (i < j) {
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
            int temp = Integer.min(height[i], height[j]) * (j - i);
            waters = Integer.max(temp, waters);
        }
        return waters;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

