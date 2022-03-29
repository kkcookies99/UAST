 class Solution {
public:
    vector<vector<int>> res;
    int count=0;
    void XXXe()
    {
        vector<int> t;
        if(count==0)
        {
            t.push_back(1);
            res.push_back(t);
            count++;
        }
        else
        {
            int temp=count-1;
            for(int i=0;i<res[temp].size();i++)
            {
                if(i==0)
                {
                   t.push_back(res[temp][i]);
                   if(count==1)
                   t.push_back(res[temp][i]);
                }
                else if(i==res[temp].size()-1)
                {
                    t.push_back(res[temp][i]+res[temp][i-1]);
                    t.push_back(res[temp][i]);
                }
                else if(i!=0)
                {
                    t.push_back(res[temp][i]+res[temp][i-1]);
                }
            }
            res.push_back(t);
            count++; 
        }
        return;               
    }
    vector<vector<int>> XXX(int numRows) 
    {
        while(count<numRows)
        {
            XXXe();
        }
        return res;
    }
};

