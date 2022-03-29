class Solution {
public:
    int XXX(string s) {
        int left(0),right(s.size() - 1);
        for(; right >= 0 && isspace(s[right]); --right) {}
        if (right == -1) {
            return 0;
        }
        for (left = right; left >= 0 && !isspace(s[left]); --left) {}
        return right - left;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


