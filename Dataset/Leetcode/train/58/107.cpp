 class Solution {
public:
    int XXX(string s) {
        if(s.size()<1) return 0;
        int len = s.size();
        int num = 0;
        int i = len-1;
        while(i>=0&&s[i]==' ') i--;
        while(i>=0&&s[i]!=' ')
        {
            num++;
            i--;
        }
        return num;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


