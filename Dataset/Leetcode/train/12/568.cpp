 class Solution {
public:
    int GetValue(int x)
    {
        int nValue = 1;
        --x;
        while(x)
        {
            nValue = nValue * 10;
            --x;
        }
        
        return nValue;
    }
    string XXX(int num) 
    {
        if(!num)return "";

        unordered_map<int,string> mp;
        mp[1] = "I";
        mp[2] = "II";
        mp[3] = "III";
        mp[4] = "IV";
        mp[5] = "V";
        mp[6] = "VI";
        mp[7] = "VII";
        mp[8] = "VIII";
        mp[9] = "IX";
        mp[10] = "X";
        mp[20] = "XX";
        mp[30] = "XXX";
        mp[40] = "XL";
        mp[50] = "L";
        mp[60] = "LX";
        mp[70] = "LXX";
        mp[80] = "LXXX";
        mp[90] = "XC";
        mp[100] = "C";
        mp[200] = "CC";
        mp[300] = "CCC";
        mp[400] = "CD";
        mp[500] = "D";
        mp[600] = "DC";
        mp[700] = "DCC";
        mp[800] = "DCCC";
        mp[900] = "CM";
        mp[1000] = "M";
        mp[2000] = "MM";
        mp[3000] = "MMM";

        int index = 0;
        int Mark = num;
        while(Mark)
        {
            Mark = Mark / 10;
            ++index;
        }
        Mark = num;
        vector<int> vec;
		int Temp;
        while(index)
        {
			if(Temp = Mark / GetValue(index) % 10 * GetValue(index))
			{
				vec.push_back(Temp);
			}
            --index;
        }
        string str = "";
        for(unsigned i = 0;i < vec.size();++i)
        {
            str = str + mp[vec[i]];
        }

        return str;
    }
};

