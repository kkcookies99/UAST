class Solution {
public:
    int XXX(string s) {
        auto p = find_if_not(s.rbegin(), s.rend(), [](auto p ) {return p == ' ';});
        auto q = find_if(p, s.rend(), [](auto p ) {return p == ' ';});
        return q - p;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


