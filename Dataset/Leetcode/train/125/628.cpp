 class Solution {
public:
    bool XXX(string s) {
        int left = 0, right = s.size() - 1;
        auto alnu = [](char c){
            return isdigit(c) || isalpha(c);
        };
        while (left < right) {
            while (left < right && !alnu(s[left])) left++;
            while (left < right && !alnu(s[right])) right--;
            if (tolower(s[left++]) != tolower(s[right--])) return 0;
        }
        return 1;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


