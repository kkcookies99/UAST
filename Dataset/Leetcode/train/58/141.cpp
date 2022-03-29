 class Solution {
public:
    int XXX(string &s) {
        for(int i=s.length(); i-- && s[i]==' '; s.pop_back());
        auto space=s.find_last_of(' ');
        return space==s.npos?s.length():s.length()-space-1;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


