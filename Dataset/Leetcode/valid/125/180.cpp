 class Solution {
public:
    bool XXX(string s) {
        if(s.empty()) return true;
        int i=0,j=s.size()-1;
        //大写转小写
        for(int i=0;i<s.size();i++){
            if(s[i]>='A'&&s[i]<='Z') s[i]=s[i]-'A'+'a';
        }
        while(i<j){
            //如果不是小写字母或者数字，直接跳过
            while(i<j&&!check(s[j]))j--;
            while(i<j&&!check(s[i]))i++;
            if(s[i]!=s[j])return false;
            i++,j--;
        }
        return true;
    }
    //检查是否为小写字母或者数字
    bool check(char t){
        if(t>='a'&&t<='z'||t>='0'&&t<='9') return true;
        else return false;
    }
};

