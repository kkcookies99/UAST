class Solution {
public:
    string XXX(string a, string b) {
        string ans="";
        int l1=a.size();
        int l2=b.size();
        if(l1>l2){
            for(int i=0;i<l1-l2;i++)b.insert(b.begin(),'0');
        }
        if(l2>l1){
            for(int j=0;j<l2-l1;j++)a.insert(a.begin(),'0');
        }
        int carry=0;
        int num=0;
        for(int h=a.size()-1;h>-1;h--){
            num=a[h]-'0'+(b[h]-'0')+carry;
            ans.insert(ans.begin(),num%2+'0');
            carry=num/2;
        }
        if(carry==1)ans.insert(ans.begin(),'1');
        return ans;
    }
};

