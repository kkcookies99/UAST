 class Solution {
public:
    string XXX(int num) {
        map<int,string>mp;
        string ans="";
        mp[1000] = "M";
        mp[900] = "CM";
        mp[500] = "D";
        mp[400]= "CD";
        mp[100] = "C";
        mp[90] = "XC";
        mp[50] = "L";
        mp[40] = "XL";
        mp[10] = "X";
        mp[9] = "IX";
        mp[5] = "V";
        mp[4] = "IV";
        mp[1] = "I";
        mp[0] = "s";
        for( auto it = mp.end();it!=mp.begin();it--)
        {
            if(it==mp.end())it--;
            while(num>=(it->first))
            {
                num-=(it->first);
                ans+=it->second;
            }
        }
        return ans;
    }
};

