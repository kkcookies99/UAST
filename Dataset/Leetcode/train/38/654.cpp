 class Solution {
public:
    string XXX(int n) {
    string str="";
    string ans="1";
    for(int i=0;i<n-1;i++){
        int count=1;
        str = ans;
        ans = "";
        for(int j=0;j<str.length();j++){
            if(str[j]==str[j+1])
                count++;
            else{
                ans+=to_string(count)+str[j];
                count=1;
            }
        }
    }
    return ans;
    }
};

