 class Solution {
public:
    string XXX(string a, string b) {
        string result;

        int n = 0;
        while(!a.empty() || !b.empty()) {
            int i = a.empty() ? 0 : a.back() - 48;
            int j = b.empty() ? 0 : b.back() - 48;

            int tmp = i + j + n;

            if(tmp >= 2) {
                result.insert(result.begin(), tmp - 2 + '0');
                n = 1;
            } else {
                result.insert(result.begin(), tmp + '0');
                n = 0;
            }

            if(!a.empty()) a.pop_back();
            if(!b.empty()) b.pop_back();
        }

        if(n == 1)
            result.insert(result.begin(), '1');

        return result;
    }
};

