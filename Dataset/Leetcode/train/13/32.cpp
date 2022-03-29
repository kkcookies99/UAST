class Solution {
public:
    int XXX(string s) {
        map<char, int> table = {
            {'I', 1},
            {'V', 5},
            {'X', 10},
            {'L', 50},
            {'C', 100},
            {'D', 500},
            {'M', 1000}
        };

        int ans = 0;
        int len = s.size();
        for(int i = 0; i < len-1; i++){
            if(table[s[i]] >= table[s[i+1]]){
                //左边>=右边时，等于加上他的原值
                ans += table[s[i]];
            }else{
                //左边<右边时，相当于加上他的负值
                ans += -table[s[i]];
            }
        }
        ans += table[s[len-1]];
        return ans;
    }
};

