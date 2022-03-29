 class Solution {
public:
    vector<int> XXX(vector<int>& digits) 
    {
        vector<int> ans;
        ans.push_back(0);
        for(int i=0;i<digits.size();i++)
        {
        ans.push_back(digits[i]);
        }
        Plus(ans,ans.size()-1);

        if(ans[0]==0)
        {
            ans.erase(ans.begin());
        }
        return ans;

    }

    void Plus(vector<int>& ans,int i)
    {
        if(ans[i]+1==10)
        {
            ans[i]=0;
            Plus(ans,i-1);
        }
        else
        {
            ans[i]++;
            return;
        }  
    }
};

