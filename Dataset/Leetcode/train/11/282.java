 public int XXX(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int result = 0;
        int distance = j;
        while(distance >= 1){
            result = Math.max(result, distance * (height[i] < height[j] ? height[i++] : height[j--]));
            distance--;
        }
        return result;
  }

