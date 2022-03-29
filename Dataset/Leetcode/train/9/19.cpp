class Solution {
public:
    bool XXX(int x) {
        if(x<0) return false;
        if(x==0) return true;
        long res=0;
        int y=x;
        while(x){
            res=res*10+x%10;
            x=x/10;
        }
        return (int)res==y?true:false;

    }
};

