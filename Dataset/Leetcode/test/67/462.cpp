class Solution {
public:
    string XXX(string a, string b) {
        int diffLen = int(a.size()) - int(b.size());
        if (diffLen > 0) {
            b = string(diffLen, '0') + b;
        } else {
            a = string(-diffLen, '0') + a;
        }

        bool needPlusOne = false;
        for (int i = a.size() - 1; i >= 0; i--) {
            int ia = a.at(i) - '0';
            int ib = b.at(i) - '0';

            ia = ia + ib + needPlusOne;
            if (ia / 2) {
                needPlusOne = true;
            } else {
                needPlusOne = false;
            }

            a.at(i) = '0' + (ia % 2);
        }

        if (needPlusOne) {
            a = "1" + a;
        }

        return a;
    }
};

