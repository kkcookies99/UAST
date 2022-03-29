 public int XXX(int[] height) {
    int length = height.length;
    if (length == 2) {
        return Math.min(height[0], height[1]);
    }
    int result = 0;
    int temp = height[0];
    for (int j = 1; j < length; j++) {
        result = Math.max(result, Math.min(temp, height[j]) * j);
    }
    for (int i = 1; i < length - 1; i++) {
        temp = height[i];
        if (temp == 0) {
            continue;
        }
        for (int j = i + result / temp + 1; j < length; j++) {
            result = Math.max(result, Math.min(temp, height[j]) * (j - i));
        }
    }
    return result;
}

