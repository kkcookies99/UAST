 class Solution {
public:
    bool XXX(int x) {
        if(x < 0) return false;
        long tmp = x, cnt = 1;
        while(tmp){
            tmp /= 10;
            cnt *= 10;
        }
        cnt /= 10;
        while(x != 0 && x != 1){
            int h = x / cnt;
            int l = x % 10;
            if(h != l) return false;
            x = x - h * cnt;
            x /= 10;
            cnt /= 100; 
        }
        return true;
    }
};```

