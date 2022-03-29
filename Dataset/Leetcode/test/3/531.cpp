 class Solution {
public:
    int XXX(string s) {
        int index[128],ans=0;
        for(int i=0;i<128;i++)
        {
            index[i]=0;
        }
        for(int j=0,i=0;j<s.size();j++)
        {
            
            i=index[s[j]]>i?index[s[j]]:i;
            ans=ans>(j-i+1)?ans:(j-i+1);
            index[s[j]]=j+1;
            
        }
        return ans;
    }
};

