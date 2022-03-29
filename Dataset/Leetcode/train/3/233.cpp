     int XXX(string s) {
        unordered_map<char, int> map;
        int ans = 0;
        
        for(int left = 0, right = 0; right < s.size(); right ++){
            if (map[s[right]]){
                left = max(map[s[right]], left);
            }
            ans = max(ans, right - left + 1);
            map[s[right]] = right + 1;
        }
        return ans;
    }

