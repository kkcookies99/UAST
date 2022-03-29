class Solution {
public:
    int XXX(int n) {
        if(n==1 || n==0)
            return 1;
        int count=XXX(n-1);
        if(n>1)
            count+=XXX(n-2);
        return count;
    }
};

