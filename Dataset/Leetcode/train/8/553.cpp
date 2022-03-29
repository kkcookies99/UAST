 class Solution {
public:
    int XXX(string s) {
        long long ans = 0;
        int single = 1;
        bool tag = false;
        for(auto ti : s){
            if(ti == ' ' && !tag){
                continue;
            }
            if(ti == '-' && !tag){
                single = -1;
                tag = true;
                continue;
            }
            else if(ti == '+' && !tag){
                tag = true;
                continue;
            }
            if(ti < '0' || ti > '9'){
                break;
            }
            if(ti >= '0' && ti <= '9'){
                tag = true;
                ans = ans * 10 + (ti - '0');
                if(ans * single >= (long long)INT_MAX){
                    ans = INT_MAX;
                    return ans;
                }
                else if(ans * single <= (long long)INT_MIN){
                    ans = INT_MIN;
                    return ans;
                }
            }
        }
        return ans * single;
    }
};

