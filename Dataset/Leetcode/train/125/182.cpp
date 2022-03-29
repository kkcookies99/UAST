 class Solution {
public:
    bool IsLetterOrNum(char ch){
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9')){
            return true;
        }
        return false;
    }
    bool XXX(string s) {
        //大小写判断有点麻烦干脆将大写字母全部转换成小写字母
        for(auto& ch:s){
            if(ch <='Z' && ch>='A'){
                ch += 32;
            }
        }
        int begin = 0;
        int end = s.size() - 1;
        while(begin<end){
            while(begin<end && !IsLetterOrNum(s[begin])){
                begin++;
            }
            while(begin <end && !IsLetterOrNum(s[end])){
                end--;
            }
            if(s[begin]==s[end]){
                ++begin;
                --end;
            }
            else{
                return false;
            }
        }
        return true;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


