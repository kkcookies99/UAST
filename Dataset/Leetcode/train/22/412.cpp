 class Solution {
public:
    vector<string> v;
    vector<string> XXX(int n) {
        digui("",0,0,n);   
        return v;
    }
    void digui(string s,int l,int r,int n)
    {
        if(l==r&&l==n) {
            v.push_back(s);
            return;
        }
        if(l<n) digui(s+"(",l+1,r,n);
        if(l>r) digui(s+")",l,r+1,n);
    }
};

