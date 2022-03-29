 class Solution {
public:
    int XXX(string s) {
      if(s.size()<=1)
        return s.size();
      int ans=0,left=0,right=0;
      unordered_set<char> window;
      for(left=0;left<s.size();left++)
        {
            while(right<s.size() && !window.count(s[right]))
            {
                window.insert(s[right]);
                right++;  
            }
            ans = max(ans, right-left);
            window.erase(s[left]);
        }
        return ans;
    }
};

