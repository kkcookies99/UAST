 class Solution {
public:
    int XXX(string s) {
        vector<string> Roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        vector<int> India = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        int res = 0;
        for (int i = 0; i < 13; i++){
            if (s.size()<Roman[i].size())
                continue;
            while (s.substr(0,Roman[i].size())==Roman[i]){
                s=s.substr(Roman[i].size());
                res+=India[i];
                if (s.size()<Roman[i].size())
                    break;
            }
        }
        return res;
    }
};

