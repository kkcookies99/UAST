 class Solution {
public:
    bool XXX(string s) {
        if(s.empty()) return true;
        int i=0,j=s.size()-1;
        while(i<j){
            while(i<j&&!is_letter(s[i])) ++i;
            if(i>=j) return true;
            while(i<j&&!is_letter(s[j])) --j;
            if(i>=j) return true;
            if(!judge(s[i],s[j])) return false;
            ++i;
            --j;
        }
        return true;
    }
    bool is_letter(char s){
        if(s>='a'&&s<='z') return true;
        if(s>='A'&&s<='Z') return true;
        if(s>='0'&&s<='9') return true;
        return false;
    }
    bool judge(char s,char t){
        if(s==t) return true;
        if((s>='0'&&s<='9')||(t>='0'&&t<='9')) return s-'0'==t-'0';
        if(s-'a'==t-'A') return true;
        if(s-'A'==t-'a') return true;
        return false;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


