 class Solution {
public:
    bool XXX(string s) {
        bool isPal = true;
        int i=0, j= s.size()-1;
        while(i < j){
            if(!isNumLetter(s[i])) {
                i++;
                continue;
            }
            if(!isNumLetter(s[j])){
                j--;
                continue;
            }
            if(toupper(s[i]) == toupper(s[j])) {
                i++,j--;
                continue;
            }
            isPal = false;
            break;
        }
        return isPal;
    }
    bool isNumLetter(char i){
        if((i>=48&&i<= 57)||(i>= 65&& i<=90)||(i>=97&&i<=122)){
            return true;
        }
        else return false;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


