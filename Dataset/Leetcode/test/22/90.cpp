 class Solution {
    int maxleft;
    int maxright;
    vector<string>ans;
public:
    void set(string str,int left,int right)
    {
        //cout<<str<<endl;
        if(left+right==maxleft+maxright)
        {
            ans.push_back(str);
            return ;
        }
        if(left<maxleft)
            set(str+"(",left+1,right);
        if(right<left&&right<maxright)
            set(str+")",left,right+1);
    }

    vector<string> XXX(int n) 
    {
        if(n==0)return  ans;
        maxleft = n;
        maxright = n;
        set("",0,0);
        return ans;
    }
};

