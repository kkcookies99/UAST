 class Solution {
public:
    string XXX(int n) {
        string * dp=new string[n];
        dp[0]='1';
        if(n==1)
            return dp[0];
        \\**\\
        for(int i=1;i<n;i++){
            stringstream vec;//放在上面\\**\\处不行，vec.clear();也不行

            string a=dp[i-1];
            for(auto it=a.begin();it!=a.end();it++){
                char char_=*it;
                int count=1;
                while(it+1!=a.end()&&char_==*(it+1))
                {
                    count++;
                    it++;
                }
                vec<<count;
                vec<<*it;
            }
            dp[i]=vec.str();
            vec.clear();
        }
        return dp[n-1];
    }
};

