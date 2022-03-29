 class Solution {
public:
    int res = 0 ;
    int XXX(string s) {
        unordered_map<char,int> heap ;
        for(int i = 0 , j = 0 ; i < s.size() ; i ++){
            heap[s[i]] ++  ;  //统计s[i]出现的次数
            while(heap[s[i]] > 1) heap[s[j ++]] -- ; 
            res = max(res,i - j + 1) ;
        }
        return res ;
    }
};

