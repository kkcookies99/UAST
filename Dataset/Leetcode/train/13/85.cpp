class Solution {
public:
    int XXX(string s) {
        unordered_map<char,int> map {{'I',1},{'V',5},{'X',10},{'L',50},{'C',100},{'D',500},{'M',1000}};
        int ans = 0,flag=0;
        for(int i = 0;i<s.size()-1;i++){
            if(map[s[i]]<map[s[i+1]]) {
                ans+=(map[s[i+1]]-map[s[i]]);
                flag+=2;
                i++;
            }
            else {
                ans+=map[s[i]];
                flag++;
            }
        }
        if(s.size()==flag) return ans;
        return ans+=map[s[s.size()-1]];
    }
};

