class Solution {
public:
    int XXX(int n) {
        int i=1,j=0;
        while(n--)
        {
            i=i+j;
            j=i-j;
        }
        return i;
    }
};

