 class Solution {
private:
    vector<string> ans;
    vector<bool> visited;

    void backtrack(string& raw,string candidate,vector<bool>& visited,int rb){
        // 有括号的个数大于左括号的个数 就不对了
        if(rb>candidate.size()-rb){
            return;
        }
        if(candidate.size()==raw.size()){
            ans.push_back(candidate);
            return;
        }
        char last=' ';
        for(int i=0;i<raw.size();i++){
            if(!visited[i]&&raw[i]!=last){
                candidate.push_back(raw[i]);
                visited[i]=true;
                if(raw[i]==')')
                    ++rb;
                backtrack(raw,candidate,visited,rb);
                if(raw[i]==')')
                    --rb;
                candidate.pop_back();
                visited[i]=false;
            
                // 与上一个相同，就剪枝
                last=raw[i];
            }
        }
    }
public:
    vector<string> XXX(int n) {
        // 回溯枚举所有可能，再验证是否符合括号原则,还得去重
        string raw;
        visited.resize(2*n,false);
        for(int i=0;i<n;i++)
            raw+='(';
        for(int i=0;i<n;i++)
            raw+=')';    
        backtrack(raw,"",visited,0);
        return ans;
    }
};

