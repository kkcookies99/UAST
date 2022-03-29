class Solution {
public:
    int XXX(string s) {
        map<char,int> mymap={{'I',1},{'V',5},{'X',10},{'L',50},{'C',100},{'D', 500},{'M', 1000}};//初始化哈希表
        int res=0;
        for(int i=0;i<s.size();i++){
        if(mymap[s[i]]>=mymap[s[i+1]])res+=mymap[s[i]];
        else res-=mymap[s[i]];}
        return res;
    }
};

