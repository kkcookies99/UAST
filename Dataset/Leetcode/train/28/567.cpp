 class Solution {
public:
    unordered_map<char, int> map;
    int XXX(string s, string p) {
        int res = -1;
        int n=s.size(), m=p.size();
        if(m==0)
            return 0;
        for(int i=0; i<m; i++)
            map[p[i]] = m - i;
        int index=0;
        while(index<n){
            if(s.substr(index, m) == p){
                res=index;
                break;
            }else if(index + m >= n)
                break;
            else if(map.count(s[index + m])){
                index += map[s[index + m]];
            }else index += m+1;
        }    
        return res;
    }
};

