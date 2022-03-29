 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows==1) return s;
        vector<string> res(numRows,"");
        string result="";
        bool con=false;
        for(int i=0,j=0;i<s.size();i++)
        {
            res[j]=res[j]+s[i];
            if (con==false) j++;
            else j--;
            if(j==numRows-1) con =true;
            else if(j==0) con =false;
        }

        for(int i=0;i<res.size();i++)
        {
            result+=res[i];
        }
        return result;
    }
};

