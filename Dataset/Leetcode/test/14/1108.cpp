 class Solution {
public:
    string XXX(vector<string>& strs) {
        int size = (int)strs.size();
        int middle = size / 2;
        if(size == 0) {
            return "";
        }
        if(size == 1) {
            return strs[0];
        }
        if(size == 2) {
            int length = min((int)strs[0].size(), (int)strs[1].size());
            if(length == 0) return "";
            string str = "";
            int i = 0;
            while(i < length && strs[0][i] == strs[1][i]) {
                str += strs[0][i];
                i++;
            }
            return str;
        }
        //左半边
        vector<string> leftStrs(strs.begin(), strs.begin() + middle );
        //右半边
        vector<string> rightStrs(strs.begin() + middle, strs.end());
        //归并
        vector<string> newStrs{XXX(leftStrs), XXX(rightStrs)};
        return XXX(newStrs);
    }
};

