 class Solution {
    public int XXX(int[] height) {
        int sum;
        int d = height.length - 1;
        int i = 0, j = d;
        int XXX = (height[i] > height[j] ? height[j] * d : height[i] * d);
        while (i != j) {
            if (height[i] < height[j]) {
                sum = height[i] * d;
                i++;
                d--;
            } else {
                sum = height[j] * d;
                j--;
                d--;
            }
            System.out.println(sum);
            XXX = sum > XXX ? sum : XXX;
        }
        return XXX;
    }
}

