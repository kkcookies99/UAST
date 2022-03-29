class Solution {
public:
    int XXX(int n) {
        int x1=1,x2=2;
        for(int i=3;i<=n;i++)
            i%2==0?x2+=x1:x1+=x2;
        return n%2==0?x2:x1;
    }
};

