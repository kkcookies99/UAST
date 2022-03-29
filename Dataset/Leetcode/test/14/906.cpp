 class Solution {
public:
    string XXX(vector<string>& strs) {
        string s = strs[0];
        int pos = s.size()-1;
        for(int i=1; i<strs.size(); i++)
        {
            int j = -1;
            for(int k=0; k<=pos; k++)
            {
                if(s[k]==strs[i][k]) j++;
                else break;    // not match
            }
            if(j==-1) return "";
            else pos = j;
        }
        return s.substr(0, pos+1);
    }
};

