class Solution {
public:
    int XXX(int x) {
        if(x ==0)
            return 0;
        int l =1, u =x;
        while(true){
            int mid = l+(u -l)/2;
            if(mid > x/mid) u = mid-1;
            else if(mid+1 > x/(mid+1)) return mid;
            else  l =mid+1;
        }
    }
};

