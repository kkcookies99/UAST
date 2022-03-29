 class Solution {
public:
    bool XXX(string s) {
        int n=s.size();
        string a="";
        //处理旧字符串，保留字母和数字，并将大写字母换成小写字母或者将小写字母变成大写字母
        for(int i=0;i<n;i++){
            if(s[i]>='0'&&s[i]<='9')
                a.push_back(s[i]);
            else if(s[i]>='a'&&s[i]<='z')
                a.push_back(s[i]);
            else if(s[i]>='A'&&s[i]<='Z')
                a.push_back(s[i]+'a'-'A');
        }
        //判断新的字符串是否是回文串
        for(int i=0;i<a.size()/2;i++){
            if(a[i]!=a[a.size()-1-i])
                return false;
        }
        return true;
    }
};

