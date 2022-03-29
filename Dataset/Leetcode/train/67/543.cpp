class Solution {
public:
    string XXX(string a, string b) {
        int lena=a.length(),lenb=b.length();
        int i,j,aa,bb,cnt=0;
        string ans="";
        for(i=lena-1,j=lenb-1;i>=0||j>=0;i--,j--){
            aa=i>=0?a[i]-'0':0;
            bb=j>=0?b[j]-'0':0;
            ans+='0'+(aa+bb+cnt)%2;
            cnt=(aa+bb+cnt)/2;
        }
        if(cnt!=0) ans+="1";
        reverse(ans.begin(),ans.end());
        return ans;
    }
};

