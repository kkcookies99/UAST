class Solution {
public:
    int twoNum(string s)
    {
        if(s == "IV")
            return 4;
        if(s == "IX")
            return 9;
        if(s == "XL")
            return 40;
        if(s == "XC")
            return 90;
        if(s == "CD")
            return 400;
        if(s == "CM")
            return 900;
        return 0;
    }
    int XXX(string s) {
        if(s.length() == 0)
            return 0;
        int ans = 0,temp = 0;
        for(int i = 0;i < s.length();i ++)
        {
            if(i + 1 < s.length())
            {
            string str = s.substr(i,2);
            temp = twoNum(str);
            if(temp > 0)
            {
                i += 1;
                ans += temp;
                continue;
            }
            }
            switch(s[i])
            {
            case 'I':ans += 1;continue;
            case 'V':ans += 5;continue;
            case 'X':ans += 10;continue;
            case 'L':ans += 50;continue;
            case 'C':ans += 100;continue;
            case 'D':ans += 500;continue;
            case 'M':ans += 1000;continue;
            }
        }
        return ans;
    }
};

