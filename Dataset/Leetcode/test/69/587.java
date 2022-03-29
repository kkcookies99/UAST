public int XXX(int x) {
        int maxSqrt = (int)Math.sqrt(Integer.MAX_VALUE);
        int max = maxSqrt* maxSqrt;
        int secondMax = (maxSqrt-1) * (maxSqrt-1);

        if(x >= max)
            return maxSqrt;
        if(x >= secondMax)
            return maxSqrt-1;
        return getMySqrt(x, maxSqrt-1, 0);
    }

    private int getMySqrt(int x, int left, int right){
        int mid = (left + right) / 2;
        int product = mid*mid;
        if(x == product){
            return mid;
        }else {
            if(product < x){
                if(mid == right)
                    return mid;
                return getMySqrt(x, left, mid);
            }
            return getMySqrt(x, mid, right);
        }
    }

