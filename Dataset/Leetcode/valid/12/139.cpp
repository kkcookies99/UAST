 class Solution {
public:
    string XXX(int num) {
        int sum[4] = { 0 ,0 ,0 , num%10 };
        string res;
        for (int i = 2; i >=0; i--) 
            sum[i] = (num /= 10) % 10;
        for (int i = 0; i < 4; i++) {
            switch (i)
            {
            case 0:
                switch (sum[i])
                {
                case 1:res.append("M"); break;
                case 2:res.append("MM"); break;
                case 3:res.append("MMM"); break;
                }break;
            case 1:
                switch (sum[i])
                {
                case 1:res.append("C"); break;
                case 2:res.append("CC"); break;
                case 3:res.append("CCC"); break;
                case 4:res.append("CD"); break;
                case 5:res.append("D"); break;
                case 6:res.append("DC"); break;
                case 7:res.append("DCC"); break;
                case 8:res.append("DCCC"); break;
                case 9:res.append("CM"); break;
                }break;
            case 2:
                switch (sum[i])
                {
                case 1:res.append("X"); break;
                case 2:res.append("XX"); break;
                case 3:res.append("XXX"); break;
                case 4:res.append("XL"); break;
                case 5:res.append("L"); break;
                case 6:res.append("LX"); break;
                case 7:res.append("LXX"); break;
                case 8:res.append("LXXX"); break;
                case 9:res.append("XC"); break;
                }break;
            case 3:
                switch (sum[i])
                {
                case 1:res.append("I"); break;
                case 2:res.append("II"); break;
                case 3:res.append("III"); break;
                case 4:res.append("IV"); break;
                case 5:res.append("V"); break;
                case 6:res.append("VI"); break;
                case 7:res.append("VII"); break;
                case 8:res.append("VIII"); break;
                case 9:res.append("IX"); break;
                }break;
            }
        }
        return res;
    }
};

