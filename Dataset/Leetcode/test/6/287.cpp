 class Solution {
public:
    string XXX(string s, int row) {
        if(row==1)return s;
        string res;
        if(s.size()==0)return res;
        vector<string> ans(row);
        bool minus=false;//line是否要做减法
        for(int i=0,j=s.size(),line=0;i<j;i++){
            ans[line].push_back(s[i]);//push_back()可能是比+=快一点
            if(line==0)
                minus=false;
            else if(line==row-1)
                minus=true;
            if(minus)
                line--;
            else
                line++;
        }
        
        for(int i=0;i<row;i++)
            res+=ans[i];
        return res;
    }
};

