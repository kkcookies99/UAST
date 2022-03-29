class Solution {
public:
    int XXX(string s) {
        unordered_map<char,int> map;
        int res=0;
        map.insert(pair<char,int>('I',1));
        map.insert(pair<char,int>('V',5));
        map.insert(pair<char,int>('X',10));
        map.insert(pair<char,int>('L',50));
        map.insert(pair<char,int>('C',100));
        map.insert(pair<char,int>('D',500));
        map.insert(pair<char,int>('M',1000));
        //比右边小就做减法，否则加法
        for(int i=0;i<s.length()-1;i++)
        {
            map[s[i]]<map[s[i+1]]?res-=map[s[i]]:res+= map[s[i]];
        }
        res+=map[s[s.length()-1]];
        return res;
    }
};

