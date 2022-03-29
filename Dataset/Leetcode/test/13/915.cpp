 class Solution {
public:
    int XXX(string s) {
        const pair <string,int> Str[]={
            {"CM",900},{"M",1000},{"CD",400},
            {"D",500},{"XC",90},{"C",100},
            {"XL",40},{"L",50},{"IX",9},
            {"X",10},{"IV",4},{"V",5},{"I",1}
        };
        int val=0;
        for(int i=0;i<s.length();i++)
        {
            string st;
            st = st + s[i];
            for(const auto &[symbol, value] : Str)
            {
                if(i < (s.length() - 1) && st + s[i+1]==symbol)
                {
                    val += value;
                    i += 1;
                    break;
                }
                else if(st==symbol)
                {
                    val += value;
                    break;
                }
            }
        }
        return val;
    }
};

