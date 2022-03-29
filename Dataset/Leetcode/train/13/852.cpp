 class Solution {
public:
    int XXX(string s) {
        unordered_map<char,int> hash;
        hash.insert({{'I',1},{'V',5},{'X',10},{'L',50},{'C',100},{'D',500},{'M',1000}});
        int sum=0;
        for(int i=0;i<s.size();i++){
            if(i>0&&hash[s[i]]>hash[s[i-1]])
                sum+=hash[s[i]]-2*hash[s[i-1]];
            else
                sum+=hash[s[i]];
        }
        return sum;
    }
};

