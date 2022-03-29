class Solution {
public:
    string XXX(int n) {
        char ch[]={'0','1','2','3','4','5','6','7','8','9'};
        string s="1";
        string temp;
        int count=1;
        int i,j;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<s.size();j++)
            {
                while(s[j]==s[j+1])
                {
                    j++;
                    count++;
                }
                    temp+=ch[count];
                    temp+=s[j];
                    count=1;
            }
            s=temp;
            temp="";
        }  
        return s; 
    }
};

