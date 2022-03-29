 class Solution {
public:
    int map[128];
    int XXX(string s) {
        int left = 0, right = 0, max = 0;
        int n = s.size();
        while(right < n){
            if(right > 0 && map[s[right]] >= left) left = map[s[right]] + 1;
            map[s[right]] = right;
            if((right - left +1) > max) max = (right - left +1);
            right++;
        } 
        return max;
    }
};

