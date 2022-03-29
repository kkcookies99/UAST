 class Solution {
public:
    bool XXX(string s) {
        if (s.length()==0)return true;
        string temp;
        for(int i=0;i<s.length();i++){                            //循环中去除除了字母及数字字符，并把大写字母改成小写
            if((s[i]>='a'&&s[i]<='z')||(s[i]>='0'&&s[i]<='9'))temp+=s[i];
            if(s[i]>='A'&&s[i]<='Z')temp+=s[i]+32;
        }
        for(int i=0;i<int(temp.length()/2);i++)                   //对半前后比较，若有不同则非回文
            if(temp[i]!=temp[temp.length()-i-1])return false;
        return true;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


