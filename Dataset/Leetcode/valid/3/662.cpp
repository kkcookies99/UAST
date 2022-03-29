 class Solution {
public:
    int XXX(string s) {
            int num = 1;
            int cNum = 1;
            int i = 1,j = 0,l = 0;
            if(s.size()==0)
                return 0;
            while(i<s.size())
            {
                j = IsBeingHere(s,l,i,s[i]);
                if(j==-1)
                {
                    cNum++;
                    i++;
                }
                else
                {
                    cNum = cNum - (j-l);
                    l = j;
                    i++;
                    cNum++;
                }
                if(cNum>=num)
                    num = cNum;
            }
            return num;
    }

    int IsBeingHere(string s,int i,int j,char c)
    {
        while(i<j)
        {
            if(c==s[i])
                return i+1;
            i++;
        }
        return -1;
    }
};

