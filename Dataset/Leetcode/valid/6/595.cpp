 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows==1)
            return s;
        vector<string> allstr(numRows,"");
        string res="";
        int i=0,size=s.size();
        int j=0,judge=0;
        while(i<size)
        {
            allstr[j]+=s[i];
            i++;
            if(j==numRows-1)
                judge=1;
            if(j==0)
                judge=0;
            if(judge==0)
                j++;
            else
                j--; 
        }
        for(int i=0;i<numRows;i++)
            res+=allstr[i];
        return res;
    }
};

