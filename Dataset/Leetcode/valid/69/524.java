public int XXX(int x) {
        if(x == 1) return 1;
        int low = 0;
        int high = x;
        while(low + 1 < high){
            int mid = low + (high - low) / 2;
            if((long)mid * mid > x){
                high = mid;
            }else{
                low = mid;
            }
        }

        return low;

    }

