 class Solution {
public:
    vector<string> ans;
    vector<string> XXX(int n) {
        string s="()";
        backtrace(s,"",n,0,0);
        return ans;
    }

    void backtrace(string s,string str,int n,int count1,int count2){
        //始终保证左括号个数大于等于右括号的规律
        if(count1>n||count2>n||count1<count2) return;
        if(count1==n&&count2==n){
            ans.push_back(str);
        }
        for(int i=0;i<s.size();i++){
            str.push_back(s[i]);
            if(s[i]=='(') count1++;
            if(s[i]==')') count2++;
            backtrace(s,str,n,count1,count2);
            if(s[i]=='(') count1--;
            if(s[i]==')') count2--;
            str.pop_back();
        }
    }

};

