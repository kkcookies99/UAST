class Solution {
public:
    string XXX(int n) 
    {
        string ans="1";
        for(int i=1;i<n;i++)
        {
            ans=Descript(ans);
        }
        return ans;

    }
    

    string Descript(string n)
    {
        string number=n;
        char NowChar=number[0];
        string ans="";
        int NowCount=1;
        for(int i=1;i<number.size();i++)
        {
            if(number[i]==NowChar)
            {
                NowCount++;
            }
            else
            {
                ans=ans+to_string(NowCount)+NowChar;
                NowChar=number[i];
                NowCount=1;
            }
        }
        ans=ans+to_string(NowCount)+NowChar;
        return ans;

    }
};

