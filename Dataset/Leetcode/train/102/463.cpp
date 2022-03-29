class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        if(nullptr == root) return {};
        vector<vector<int>> results;
        vector<int> res;
        queue<TreeNode*> helper;
        helper.push(root);
        while(!helper.empty()) {
            int size = helper.size();
            for(int i=0; i<size; i++) {
                res.push_back(helper.front()->val);
                if(nullptr != helper.front()->left) helper.push(helper.front()->left);
                if(nullptr != helper.front()->right) helper.push(helper.front()->right);
                helper.pop();
            }
            results.push_back(res);
            res.clear();
        }
        return results;
    }
};

