 class Solution {
public:
    int XXX(string haystack, string needle) {
        int n = haystack.size();
        int m = needle.size();
        if(m <= 0) return 0;
        if(n <= 0) return -1;

        //预处理有限状态机
        vector<int> FSM(m+1,0);
        createFSM(needle,FSM);


        //使用有限状态机进行匹配
        int i = 0;
        int prefix = 0;
        while(i < n){ 
            while(prefix > 0 && needle[prefix] != haystack[i]){
                prefix = FSM[prefix];
            }
            if(haystack[i] == needle[prefix]) prefix++;
            
            i++;
            if(prefix == m) return i - m;
        }

        return -1;
    }

    //生成有限状态机
    //FSM[i]表示已匹配长度为i的状态下，所转移的下一个已匹配长度
    void createFSM(const string &needle,vector<int>& FSM){
        int n = needle.size();
        int prefix = 0,cur = 1;
        FSM[0] = 0;
        while(cur < n){
            while(prefix > 0 && needle[prefix] != needle[cur]){
                    prefix = FSM[prefix]; 
            }
            if(needle[prefix] == needle[cur]) prefix++;
            FSM[++cur] = prefix;
        }

    }

};

