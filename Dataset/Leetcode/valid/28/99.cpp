 class Solution {
public:
    int* buildnext(string& p){
        int m=p.size(),j=0;
        int *N=new int[m];
        int t=N[0]=-1;
        while(j<m-1){
            if(t<0||p[j]==p[t]){
                ++t;++j;
                N[j]=p[j]==p[t]?N[t]:t;
            }
            else t=N[t];
        }
        return N;
    }
    int XXX(string &haystack, string &needle) {
       if(needle.empty())return 0;
       int m=needle.size(),n=haystack.size(),i=0,j=0;
       int *next=buildnext(needle);
       while(j<m&&i<n){
           if(j<0||haystack[i]==needle[j]){++i;++j;}
           else j=next[j];
       }
       delete[] next;
       return i-j>n-m?-1:i-j;
    }
};

