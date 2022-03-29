class Solution {
public:
    int XXX(string s) {
        s+="O";
        unordered_map<char,int> umap={
            {'O',0},
            {'I',1},
            {'V',5},
            {'X',10},
            {'L',50},
            {'C',100},
            {'D',500},
            {'M',1000},
        };
        int res=0;
        for(int i=0;i<s.size()-1;i++){
            if(umap[s[i]]>=umap[s[i+1]])
                res+=umap[s[i]];
            else{
                res+=umap[s[i+1]]-umap[s[i]];
                i++;
            }
        }
        return res;
    }
};

