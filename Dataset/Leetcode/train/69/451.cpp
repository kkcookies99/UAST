class Solution {
public:
    int XXX(int x) {
        if(x==1)return 1;
        int i2=x,i1=0;
        int mid=(i1+i2)/2;
        if(mid>46339){
            i2=46340;
            mid=46339;
        }
        if(46340*46340<=x)return 46340;
        while((mid*mid>x&&(mid+1)*(mid+1)>=x)||(mid*mid<x&&(mid+1)*(mid+1)<=x)){
            if(mid*mid<x){
                i1=mid;
            }else{
                i2=mid;
            }
            mid=(i1+i2)/2;
        }
        return mid;
    }
};

