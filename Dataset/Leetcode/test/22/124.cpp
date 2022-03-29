 class Solution {
public:
    vector<string> ans;
    vector<string> XXX(int n) {
        string str="";
        DFS(str,n,n);
        return ans;
    }
    void DFS(string str,int n1,int n2)
    {
        if(n1==0&&n2==0)
        {
            ans.push_back(str);
            return;
        }
        if(str=="")
        {
            str+="(";
            DFS(str,n1-1,n2);
        }
        else if(str.back()=='(')
        {
            if(n1>0)
            {
                str+="(";
                DFS(str,n1-1,n2);
                str.pop_back();
            }
            str+=")";
            DFS(str,n1,n2-1);
            str.pop_back();
        }
        else
        {
            if(n1>0)
            {
                str+="(";
                DFS(str,n1-1,n2);
                str.pop_back();
            }
            if(n1<n2)
            {
                str+=")";
                DFS(str,n1,n2-1);
                str.pop_back();
            }
        }

    }
};

