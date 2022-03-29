public int XXX(int[] height) {
    int area = 0;
    for (int i = 0; i < height.length; i++) {
        if (height[i] * (height.length - i) < area) {
            continue;
        }
        for (int j = i; j < height.length; j++) {
            int areaSize = getAreaSize(i, j, height);
            System.out.println("areaSize =" + areaSize + "i = " + i + "j = " + j);
            if (areaSize > area) {
                area = areaSize;
            }
        }
    }
    return area;
}

private int getAreaSize(int i, int j, int[] height) {
    if (height[i] > height[j]) {
        return height[j] * (j - i);
    } else if (height[i] <= height[j]) {
        return height[i] * (j - i);
    }
    return 0;
}
