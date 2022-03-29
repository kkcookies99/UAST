 class Solution {
public:
    const string roma[13]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    const int val[13]={1000,900,500,400,100,90,50,40,10,9,5,4,1};

    int XXX(string s) {
        int res = 0;
        for(int i = 0, from = 0; i < 13 && from < s.size(); ++i){
            while(from < s.size()){
                int pos = s.find(roma[i], from);
                if(pos == from){
                    res += val[i];
                    from += roma[i].size();
                }else break;
            }
        }
        return res;
    }
};

