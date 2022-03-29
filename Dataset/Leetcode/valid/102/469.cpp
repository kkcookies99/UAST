class Solution {
public:
    vector<vector<int>> XXX(TreeNode* root) {
        if(root==nullptr){
            return {};
        }
        vector<vector<int>> ans;
        vector<int> tmp;
        queue<TreeNode*> Q;
        Q.push(root);
        while (!Q.empty()) {
            int sz = Q.size();
            while (sz > 0) {
                TreeNode* node = Q.front();
                tmp.push_back(node->val);
                Q.pop();
                if (node->left) 
                   Q.push(node->left);
                if (node->right) 
                   Q.push(node->right);
                sz -= 1;
            }
            ans.push_back(tmp);
            tmp.clear();
        } 
        return ans;
    }
};

