class Solution {
public:
    string XXX(int n) {
       if (n == 1) return "1";
       string tmp = XXX(n - 1);
       string res;
       char prev = tmp[0];
       int count = 0;
       for (int i = 0; i < tmp.size(); i++) {
           if (tmp[i] == prev) {
               count++;
           }
           else {
               res.push_back('0' + count);
               res.push_back(prev);
               count = 1;
               prev = tmp[i];
           }
       }
       res.push_back('0' + count);
       res.push_back(prev);
       return res;
    }
};

