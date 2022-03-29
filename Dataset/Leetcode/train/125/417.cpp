 class Solution {
public:
    bool XXX(string s) {
        int n=s.length();
        string str="";
        for(int i=0;i<n;i++){//将符合题意的char放入新str
            if(isalpha(s[i])||isdigit(s[i])){
                str+=s[i];
            }
        }
        for(int i=0;i<str.length();i++){//将str中的所有的大写字母转换为小写字母
        if(str[i]>='A'&&str[i]<='Z'){
            str[i]=tolower(str[i]);
        }
    }
        //双指针遍历str，判断回文串
        int p=0,q=str.length()-1;
        while(p<q){
            if(str[p]!=str[q]) return false;
            p++;
            q--;
        }
        return true;
    }
};

