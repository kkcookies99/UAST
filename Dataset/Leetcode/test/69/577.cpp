class Solution {
public:
    int XXX(int x) {
        if(x==0) return 0;
        int i=1;
        while(i<=x/i){
            i=2*i;
        }
        int j=i/2,k=i/2;
        while(i-j>1){
            int mid=(j+i)/2;
            if(mid<x/mid) {j=mid;}
            else if(mid>x/mid) {i=mid;}
            else return mid;
        }
        return j;
    }
};

