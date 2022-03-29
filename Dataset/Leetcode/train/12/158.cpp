 class Solution {
public:
    string XXX(int num) 
    {
        vector<pair<char,char>> table{
            {'I','V'},
            {'X','L'},
            {'C','D'},
            {'M',0}}; 

        string ans;
        int unit=1000;
        for(int mag=3;mag>=0;mag--)
        {
            int val=num/unit;
            if(val==9)
                ans=ans+table[mag].first+table[mag+1].first;
            else if(val==4)
                ans=ans+table[mag].first+table[mag].second;
            else
            {
                if(val>=5)
                    ans+=table[mag].second;
                ans+=string(val%5,table[mag].first);
            }
            num=num%unit;
            unit/=10;
        }
        return ans;
    }
};

