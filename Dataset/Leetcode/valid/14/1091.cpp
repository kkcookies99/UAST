 class Solution {
public:
    string XXX(vector<string>& strs) {
     if (strs.size() < 1)
		{
			return "";
		}
		int len=strs[0].size();
        string res="";
        int i;
        for(int j=0;j<len;++j)
        {
            
            for( i=1;i<strs.size();++i)
            {
                if(strs[0][j]!=strs[i][j] ||strs[i][j]=='\0')
                    break;
            }
            if(i==strs.size())
            {
                res+=strs[0][j];
            }
            else
            {
                return res;
            }
        }
        return res;
    }
};

