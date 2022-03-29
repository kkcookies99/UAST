 class Solution {
public:
    string XXX(vector<string>& strs) {
        if(strs.size()==0)
            return "";
        string str="";
        int min_lenth=strs[0].size();
        for(int i=1;i<strs.size();i++)
        {
            if(min_lenth>=strs[i].size())
                min_lenth=strs[i].size();
        }
        for(int k=0;k<min_lenth;k++)    
        {
            char s=strs[0][k];
            for(int j=1;j<strs.size();j++)
            {
                if(s!=strs[j][k])
                    return str;
            }
            str+=s;
        }
        return str;
    }
};

