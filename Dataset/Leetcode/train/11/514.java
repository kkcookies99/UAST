 public int XXX(int[] height) {
        int max = 0, left = 0, right = height.length - 1, temp;
        while (right > left) {

            if (height[left] <= height[right]) {
                temp = height[left];
                max = Math.max(height[left] * (right - left), max);
                while (temp > height[left + 1] && right > left) {
                    left++;
                }

                if (right > left + 1) {
                    left++;
                } else break;
            } else {
                temp = height[right];
                max = Math.max(height[right] * (right - left), max);
                while (temp > height[right - 1] && right > left) {
                    right--;
                }

                if (right - 1 > left) {
                    right--;
                } else break;
            }

        }


        return max;
    }

