 class Solution {
public:
    int XXX(string s) {
        unordered_map<char, int> m;
        int maxLen = 0, from = 0, end = 0;
        int lastRepeatPos = -1;
        for(int i = 0; i < s.size(); i++){
            if (m.find(s[i]) != m.end() && lastRepeatPos < m[s[i]]) {
                lastRepeatPos = m[s[i]];
            }
            if ( i - lastRepeatPos > maxLen ){
                maxLen = i - lastRepeatPos;
                from = lastRepeatPos + 1;
                end = i + 1;
            }
            m[s[i]] = i;
        }
        cout << "target: " << from << ", " << end << " --> " << s.substr(from, end - from).c_str() << endl;
        return maxLen;
    }
};

