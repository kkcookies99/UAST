class Solution {
public:
    int XXX(string s) {
        unordered_map<char, int> T = { 
            {'I',1},{'V',5},{'X',10},{'L',50},{'C',100},{'D',500},{'M',1000}};
        int sum = T[s.back()];
        for(int i = s.size() - 2; i >= 0; i--)
            sum +=  (T[s[i]] < T[s[i+1]] ? -T[s[i]] : T[s[i]]);
        return sum;
    }
};

