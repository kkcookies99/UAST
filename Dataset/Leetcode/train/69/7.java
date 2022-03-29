class Solution {
    public int XXX(int x) {
        double l = 0, r = x, ret = 0;

        while(l <= r){
            double mid = (int) (l + (r - l)/2);
            ret = mid;
            if(mid*mid == x){
                break;
            }else if(mid*mid > x){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }

        if(ret*ret > x){
            ret--;
        }

        return (int) ret;
    }
}

