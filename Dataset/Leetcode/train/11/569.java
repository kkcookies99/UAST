 public int XXX(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            int a = height[left];
            int b = height[right];
            int smaller = Math.min(a, b);
            max = Math.max((right - left) * smaller, max);
            if (smaller == a) {
                while (left < right && height[left] <= a) {
                    left++;
                }
            } else {
                while (left < right && height[right] <= b) {
                    right--;
                }
            }
        }
        return max;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


