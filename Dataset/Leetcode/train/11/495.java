 public int XXX(int[] height) {
    int max = 0;
    for (int i = 0; i < height.length; i++) {
        for (int j = i+1; j < height.length; j++) {
            max =Math.max( (j-i)*Math.min(height[j],height[i]),max);
        }
    }
    return max;
}
