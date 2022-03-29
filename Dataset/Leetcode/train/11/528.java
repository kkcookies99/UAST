 public int XXX(int[] height) {
    int max = 0;
    for (int i=0; i<height.length-1; i++) {
        for (int j=i+1; j<height.length; j++) {
            int h = Math.min(height[i], height[j]);
            int area = (j-i) * h;
            max = Math.max(max, area);
        }
    }

    return max;
}

