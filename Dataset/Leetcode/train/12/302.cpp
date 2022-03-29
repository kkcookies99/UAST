 class Solution {
public:
    string XXX(int num) {
        string res{};
        int qian=num/1000;
        int bai=num/100%10;
        int shi=num/10%10;
        int ge=num%10;
        if(qian){
            vector<string> str{"M","MM","MMM"};
            res+=str[qian-1];
        }
        if(bai){
            vector<string> strs{"C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
            res+=strs[bai-1];
        }
        if(shi){
            vector<string> strs2{"X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
            res+=strs2[shi-1];
        }
        if(ge){
            vector<string> strs3{"I","II","III","IV","V","VI","VII","VIII","IX","X"};
            res+=strs3[ge-1];
        }
        return res;
    }
};

