 class Solution {
public:
        vector<int> build(string input){
            int len = 0;
            vector<int> res(input.size(), 0);
            int i = 1;
            while(i < input.size()){
                if(input[len] == input[i]){
                    len++;
                    res[i] = len;
                    i++;
                }else{
                    if(len > 0){
                        len = input[len-1];
                    }else{
                        res[i] = len;
                        i++;
                    }
                }
            }
            res.insert(res.begin(), -1);
            vector<int> res1(res.begin(), res.end()-1);
            return res1;
        }

        int kmp(string input, string input1, vector<int>& pattern){
            //input是haystack， input1是needle
            //input[i], len(input) = m;
            //input1[j], len(input1) = n;
            int res = -1;
            int i = 0, j = 0;
            int m = input.size(), n = input1.size();
            while(i < m){
                if(j == n - 1 && input[i] == input1[j])return i-j;
                if(input[i] == input1[j]){
                    i++; j++;
                }else{
                    j = pattern[j];
                    if(j == -1){
                        i++; j++;
                    }
                }
            }
            return -1;
        }

        int XXX(string haystack, string needle) {
            vector<int> input = build(needle);
            return kmp(haystack, needle, input);
        }

};

