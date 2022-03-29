 public int XXX(int[] height) {
        int max = 0;
        Random random = new Random();
        int len  = height.length;
        for(int i=0;i < 100000000;i++){
            int left = random.nextInt(len);
            int right = random.nextInt(len);
            if(left == right) continue;
            max = Math.max(max , (right - left) * Math.min(height[left], height[right]));
        }
        return max;
    }

