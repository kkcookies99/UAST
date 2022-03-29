public int XXX(int x) {
        if (x==1){
            return 1;
        }
        double res = x/2;
        while (res*res>x){
            res = res/2;
        }
        int l = (int)res,r = (int)res*2;
        int ans=0;
        while(l<=r){
            int mid = (l+r) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

