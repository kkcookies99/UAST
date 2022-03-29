 public int XXX(int[] height) {
        int L = 0; 
        int R = height.length - 1;
        int max = 0;
    

        while(L != R ) {
            int S = 0;
            S = Math.min(height[L],height[R]) * (R - L);

            if( height[L] > height[R] ) {
                R--;
            }else {
                L++;
            }

            if(max < S) {
                max = S;
            }

        }
    
        return max;
    }

