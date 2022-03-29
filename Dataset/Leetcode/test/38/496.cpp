 class Solution {
public:
    string XXX(int n) {
        string curStr = "1";
        return dfs(n,curStr);
    }
    string dfs(int n,string prevStr){
        if(n==1)
            return prevStr;
        string curStr;
        int left = 0,right = 0;
        while(right < prevStr.size()){
            while(right<prevStr.size() && prevStr[left]==prevStr[right]){
                right++;
            }
            curStr += to_string(right-left);
            curStr += prevStr[left];
            left = right;
        }

        return dfs(n-1,curStr);
    }
};

