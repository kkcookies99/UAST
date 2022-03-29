class Solution {
public:
    bool XXX(int x) {
        int tmp=0;
        if(x>0&&x%10!=0){
            while(x>tmp){
                tmp=tmp*10+x%10;
                x/=10;
            }
        }
        if(x==tmp||x==tmp/10)return true;
        return false;
    }
};

