class Solution {
public:
    bool XXX(int x) {
        
        if(x<0) return false;
        int remain=0, div=x;
        long res=0;
        while(div != 0){
            remain = div%10;
            div = div/10;
            res = res*10+remain;
        }
        if(x == res) 
            return true;
        else
            return false; 
    }
};

