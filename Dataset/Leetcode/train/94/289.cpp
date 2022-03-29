 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        stack<TreeNode*> s;
        TreeNode *cur=root;
        vector<int> ans;
        while(cur || !s.empty()){
            while(cur){
                s.push(cur);
                cur = cur->left;
            }
            if(!s.empty()){
                cur = s.top();
                s.pop();
                ans.emplace_back(cur->val);
                cur = cur->right;
            }
        }
        return ans;
    }
};

