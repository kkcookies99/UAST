class Solution {
public:
    int XXX(string s) {
        int a[999] = {0};
        for(int i = 0; i < s.size(); i++)
        {
            switch(s[i])
            {
                case 'I':
                    a[i] = 1;
                    break;
                case 'V':
                    a[i] = 5;
                    break;
                case 'X':
                    a[i] = 10;
                    break;
                case 'L':
                    a[i] = 50;
                    break;
                case 'C':
                    a[i] = 100;
                    break;
                case 'D':
                    a[i] = 500;
                    break;
                case 'M':
                    a[i] = 1000;
                    break;
            }
        }
        int res = 0;
        for(int i = 0; i < s.size()-1; i++)
        {
            if(a[i] >= a[i+1])
            {
                res += a[i];
            }
            else
                res -= a[i];
        }
        res += a[s.size()-1];
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

