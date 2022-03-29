class Solution {
public:
    bool XXX(int x) {
        if(x<0) return false;
        vector<int> a,b;
        while(x)
        {
            a.push_back(x%10);
            x/=10;
        }
        b=a;
        reverse(a.begin(),a.end());
        if(a==b) return true;
        else return false;
    }
};

