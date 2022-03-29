 class Solution {
public:
    string XXX(int num) {
        map<int, string>m;
        m[1] = "I";
        m[4] = "IV";
        m[5] = "V";
        m[9] = "IX";
        m[10] = "X";
        m[40] = "XL";
        m[50] = "L";
        m[90] = "XC";
        m[100] = "C";
        m[400] = "CD";
        m[500] = "D";
        m[900] = "CM";
        m[1000] = "M";
        map<int, string>::reverse_iterator it;
        string ans = "";
        while(num != 0){
            for(it = m.rbegin();it != m.rend();it++){
                if(num >= it->first){
                    num -= it->first;
                    ans += it->second;
                    break;
                }
            }
        }
        return ans;
    }
};

