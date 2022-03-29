 class Solution {
public:
    vector<int>a;
    vector<int> q;
    vector<vector<int>>p;
    int *x;//存储0-1变量
    int n;//存储数组大小
    void BackTrack(int t)
    {
        if(t>=n)
        {
            for(int i=0;i<q.size();i++)
            {
                if(x[i]==1)
                {
                    a.push_back(q[i]);
                }
            }
            p.push_back(a);
            a.clear();
        }
        else
        {
            x[t]=0;
            BackTrack(t+1);
            x[t]=1;
            BackTrack(t+1);
            
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        x=new int [nums.size()+1];
        q=nums;
        n=nums.size();
        BackTrack(0);//递归求解
        return p;
    }
};

