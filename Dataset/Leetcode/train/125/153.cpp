 class Solution {
public:
    bool isNum(char &c){
        if(c >= 48 && c <= 57) return true;
        if(c >= 65 && c <= 90) return true;
        if(c >= 97 && c <= 122){
            c -= 32;
            return true;
        }
        return false;
    }
    bool XXX(string s) {
        int i = 0, j = s.size() - 1;
        while(i < j){
            if(isNum(s[i]) == false) ++ i;
            else if(isNum(s[j]) == false) -- j;
            else if(s[i] != s[j]) return false;
            else{
                ++ i;
                -- j;
            }
        }
        return true;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


