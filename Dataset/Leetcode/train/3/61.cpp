 class Solution {
public:
    int XXX(string s) {
       int l=0, r=0, n=s.size(), re=0;
       
       vector<int> win(128);
       while(r < n){
           win[s[r]]++;
           while(win[s[r]] == 2){
               // 遇到了重复元素
               re = max(re, r-l);
               win[s[l]]--;
               l++;
           }
           r++;
       }
       return re;
    }
};


