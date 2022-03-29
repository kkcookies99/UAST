 class Solution {
public:
    string XXX(string s) {
        if (s.empty() || s.size() == 1)
            return s;
        int start(0), end(0);
        int maxLen(0);
        for (int i = 0; i < s.size(); i++){
            int len1 = findSameLength(s, i, i);
            int len2 = findSameLength(s, i, i + 1);
            if (maxLen < max(len1, len2)){
                maxLen = max(len1, len2);
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }
        return s.substr(start, end - start + 1);
    }
private:
    int findSameLength(string &s, int left, int right){
        while (left >= 0 && right < s.size() && s.at(left) == s.at(right))
            left--, right++;
        return right - left - 1;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

