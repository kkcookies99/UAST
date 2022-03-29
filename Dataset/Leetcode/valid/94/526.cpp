 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> ans;
        stack<TreeNode*> s;
        while(root || s.size()){
            while(root){
                s.push(root);
                root = root->left;
            }
            TreeNode* node = s.top(); s.pop();
            ans.push_back(node->val);
            root = node->right;
        }
        return ans;
    }
};```

