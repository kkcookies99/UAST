class Solution {
public:
    int XXX(string s) {
        string reps[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};

        int res = 0;

        unordered_map<string, int> mp;

        for(int i=0; i<13; i++) mp[reps[i]] = values[i];

        int n = s.length();

        for(int i=0; i<n; i++){
            if(n-1 == i){
                res += mp[s.substr(i,1)];    
            } else {
                if(mp.count(s.substr(i, 2))){
                    res += mp[s.substr(i,2)];
                    i++;
                } else {
                    res += mp[s.substr(i,1)];
                }
            }
        }
        return res;
    }
};

