 class Solution {
public:
    Solution():root(nullptr),v(26,nullptr){}
    string XXX(vector<string>& strs) {
        if(strs.empty())
            return "";
        sort(strs.begin(),strs.end(),[](const string& s1,const string& s2)->bool{
            return s1.size() < s2.size();
        });
        for(auto& s:strs){
            insert(s);
        }
        return strs[0].substr(0,getmaxCommonPrefix());
    }

    void insert(string& str){
        if(root == nullptr)
            root = new Solution();
        Solution* node = root;
        for(char c:str){
            if(node->v[c - 'a'] == nullptr)
                node->v[c - 'a'] = new Solution();
            node = node->v[c - 'a'];
        }
    }

    int getmaxCommonPrefix(){
        if(root == nullptr)
            return 0;
        int count = 0;
        while(root){
            Solution* temp = nullptr;
            bool isvalid = true;
            for(auto it : root->v){
                if(it != nullptr && !isvalid)
                    return count;
                else if(it != nullptr){
                    temp = it;
                    isvalid = false;
                }
            }
            ++count;
            root = temp;
        }
        return count;
    }
private:
    Solution* root;
    vector<Solution*> v;
};

