class Solution {
public:
    string XXX(int n) {
        string ans = "1";
        for(int j = 1; j<n; j++){
            string res="";
            int len = ans.size();
            for(int i=0; i<len; i++){
                int flag=i;
                while(i < len-1 && ans[i]==ans[i+1]) i++;
                res += to_string(i-flag+1) + ans[i]; 
            }
            ans = res;
        }

        return ans;
    }
};

