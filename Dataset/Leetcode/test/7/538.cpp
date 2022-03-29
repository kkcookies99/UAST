 class Solution {
public:
    typedef long long ll;
    int XXX(int x) {
        ll y=x,z=0;
        while(y){
            z*=10;
            z+=y%10;
            y/=10;
        }
        if(z>=(ll)1<<31||z<-((ll)1<<31)){
            return 0;
        }
        return z;
    }
};

