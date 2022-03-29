 class Solution {
public:
    bool XXX(string s) {
        char a[10000];
        int i=0;
        int x =s.size();
        for(int m = 0;m<x;m++)
        {
            switch(s[m]){
                case '(':
                    a[i++] = '(';
                    break;
                case '{':
                    a[i++] = '{';
                    break;
                case '[':
                    a[i++] = '[';
                    break;
                case ')':
                if(i==0) return 0;
                    if(a[i-1]=='(') i--;
                    else return 0;
                    break;
                case '}':
                if(i==0) return 0;
                    if(a[i-1]=='{') i--;
                    else return 0;
                    break;
                case ']':
                if(i==0) return 0;
                    if(a[i-1]=='[') i--;
                    else return 0;
                    break;
            }
        }
        if(i==0)
        return 1;
        return 0;
    }
};

