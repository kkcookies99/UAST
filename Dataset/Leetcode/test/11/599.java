     public int XXX(int[] height) {
        int L = 0;
        int R = height.length-1;
        int max = 0;
        while(L<R) {
            int m = (R-L)*Math.min(height[R],height[L]);
            max = Math.max(max,m);
            if(height[R]>height[L]) while(height[L++]>height[L]&&L<R);
            else while(height[R--]>height[R]&&L<R);
        }
        return max;
    }

