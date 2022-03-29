class Solution {
public:
    bool XXX(int x) {
        long temp = 0;
        int a = x;
        while(x)
        {
            temp=temp*10+x%10;
            x = x/10;
        }
        if(temp == a&&a>=0)
        return true;
        else
        return false;
    }
};

