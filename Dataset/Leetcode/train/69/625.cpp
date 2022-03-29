class Solution {
public:
    int XXX(int x) {
        if(x==0||x==1)
            return x;
        if(x==2||x==3)
            return 1;
        for(int i=2;i<=(x/2+1);++i){
            if(x/i>=i&&(x/(i+1)<(i+1))){
                return i;
            }
        }
        return 0;
    }
};

