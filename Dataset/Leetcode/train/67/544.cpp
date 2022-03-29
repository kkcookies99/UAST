class Solution {
public:
    string XXX(string a, string b) {
        int len1=a.length(),len2=b.length();
        if(len2>len1){
            swap(a,b);
            swap(len1,len2);
        }
        int i=len1,j=len2;
        string ans(i+1,'0');
        int jinwei=0;
        while(j>0){
            int add=(a[i-1]-'0')+(b[j-1]-'0')+jinwei;
            ans[i]=add%2+'0';
            jinwei=add>1?1:0;
            i--;
            j--;
        }
        while(i>0){
            int add=a[i-1]-'0'+jinwei;
            ans[i]=add%2+'0';
            jinwei=add>1?1:0;
            i--;
        }
        if(jinwei==1){
            ans[i]='1';
            return ans;
        }
        else return ans.substr(1);
    }
};

