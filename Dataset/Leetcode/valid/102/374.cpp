class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        vector<vector<int>> ret;
        if(root == nullptr) return ret;
        queue<TreeNode*> ans;
        ans.push(root);
        int x;
        while(!ans.empty()){
            ret.push_back({});
            x = ans.size();
            for(int a = 0; a < x; ++a){
                if(ans.front()->left != NULL) ans.push(ans.front()->left);
                if(ans.front()->right != NULL) ans.push(ans.front()->right);
                ret[ret.size() - 1].push_back(ans.front()->val);
                ans.pop();
            }
        }
        return ret;
    }
};

