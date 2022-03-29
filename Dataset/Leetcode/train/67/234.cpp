 class Solution {
public:
    string XXX(string a, string b) {
        //模拟传统的加法
        int m=a.size(),n=b.size();
        int sum,numa=0,numb=0,carry=0;
        string res;
        for(int i=m-1,j=n-1;i>=0||j>=0;j--,i--){
            sum=carry;
            if(i>=0)sum+=a[i]-'0';
            if(j>=0)sum+=b[j]-'0';
            res.push_back(sum%2+'0');
            carry=sum/2;
        }
        if(carry)res.push_back('1');
        reverse(res.begin(),res.end());
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


