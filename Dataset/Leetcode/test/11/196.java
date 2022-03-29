class Solution {
    public int XXX(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int area = Math.min(height[i], height[j]) * (j - i);
        boolean idxChanged;
        do {
            idxChanged = false;
            if (height[j] < height[i]) {
                for (int k = j - 1; k > i; k--) {
                    if (height[k] > height[j]) {
                        j = k;
                        idxChanged = true;
                        area = Math.max(area, Math.min(height[i], height[j]) * (j - i));
                        break;
                    }
                }
            } else {
                for (int k = i + 1; k < j; k++) {
                    if (height[k] > height[i]) {
                        i = k;
                        idxChanged = true;
                        area = Math.max(area, Math.min(height[i], height[j]) * (j - i));
                        break;
                    }
                }
            }
        } while (idxChanged);

        return area;
    }
}

