class Solution {
public:
    int XXX(vector<int>& h) {
        int res = 0;
        for(int l = 0, r = h.size()-1;l < r;){
            res = max(res,(r - l)*min(h[r],h[l]));
            if(h[l] < h[r]) l ++;
            else r --;
        }
        return res;
    }
};

