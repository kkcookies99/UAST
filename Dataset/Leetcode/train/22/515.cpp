 class Solution {
public:

    string cur;
    vector <string> ans;
    
    vector<string> XXX(int n) {
        DFS(n-1,n,'(');
        return ans;
    }

    void DFS(int l, int r,char c)
    {
        cur +=c;
        if(l == 0 && r == 0)
        ans.push_back(cur);
        if(l<=r&& l>0&& r>0) //剩余括号数
        {
            DFS(l-1,r,'(');
              cur.pop_back();
            DFS(l,r-1,')');
              cur.pop_back();
        }
        else if(l<=r&&r>0&&l==0)
        {
            DFS(l,r-1,')');
              cur.pop_back();
        }
    }
};

