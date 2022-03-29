class Solution {
public:
    string minWindow(string s, string t) {
        // counter代表t串中的字符出现频率,solver用来标明s串限定区域内的t串字符出现频率
        unordered_map<char, int> counter, solver;
        // count用来表示s串限定区域内出现t串有效字符的数量
        int count = 0;
        int start = -1;
        int end = 0;
        int length = 0;
        string result;
        for(int i=0; i<t.size(); i++){
            counter[t[i]]++;
            // solver[t[i]] = 0;
        }
        for(int i=0; i<s.size(); i++){
            char a = s[i];
            // 只处理t串中出现的字符
            if(counter.count(a)){
                // 当[start, end]未能有效覆盖t串时,需要确定start的有效起始位置(略过所有非t串字符)
                // 当[start, end]能有效覆盖t串时,确定end的初始位置
                if(count < t.size()){
                    // 只有当i位置字符是[start, end]内的字符覆盖s串所必须的情况下,count++
                    if(solver[a] < counter[a]) count++;
                    solver[a]++;
                    // start的有效起始位置
                    if(count==1 && start==-1) start = i;
                    // end的初始位置
                    if(count==t.size()){
                        end = i;

                        int j = start;
                        // 确定start初始的最大位置
                        while(!counter.count(s[j]) || solver[s[j]] > counter[s[j]]){
                            if(counter.count(s[j])) solver[s[j]]--;
                            j++;
                        }
                        start = j;

                        result = s.substr(start, end-start+1);
                        length = result.size();
                    }
                }
                // 尝试右移end
                else{
                    solver[a]++;
                    end = i;
                    // 当end位置的字符恰好为start位置字符时,才存在缩小区域可能
                    if(a == s[start]){
                        solver[a]--;
                        int j = start + 1;
                        // 保证[start,end]能覆盖t串的前提下尽可能右移start
                        while(!counter.count(s[j]) || solver[s[j]] > counter[s[j]]){
                            if(counter.count(s[j])) solver[s[j]]--;
                            j++;
                        }
                        start = j;
                        // 新的[start,end]区间大小比历史记录小,则更新
                        if(end-start+1 < length){
                            result = s.substr(start, end-start+1);
                            length = result.size();
                        }
                    }
                }
            }
        }
        return result;
    }
};

