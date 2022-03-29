 class Solution {
public:
    string XXX(int n) {
        string res = "1";
        for(int i = 1; i < n; i ++){
            string tmp;
            for(int i = 0; i < res.size();){
                int k = 1;
                int j;
                for(j = i + 1; j < res.size() && res[i] == res[j]; j ++)
                    k ++;
                tmp += to_string(k) + res[i];
                i = j;
            }
            res = tmp;
        }
        return res;
    }
};

