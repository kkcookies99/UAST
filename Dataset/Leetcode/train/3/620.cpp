 class Solution {
public:
    int XXX(string s) 
    {
        //unordered_set<char> substring;
        unordered_map<char,int> index;
        int n = s.size();
        int ans = 0;
        //int lptr = 0;
       // int rptr = 0;
        for(int l = 0,r=0;r != n;++r)
        {
            char c = s[r];
            l = max(l, index[c]);//index[c]初始值为0，遇到重复字符后，l跳转到重复字符上一次出现的下一个位置
            ans = max(ans, r - l + 1);
            index[c] = r + 1; //记录字符c的下一个位置            
        }
       return ans;

