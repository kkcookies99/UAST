 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        if(!root) return res;
        stack<TreeNode*> stk;
        TreeNode* cur = root;
        while(cur != nullptr || !stk.empty()){
            if(cur != nullptr){
                stk.push(cur);
                cur = cur->left;
            }else{
                cur = stk.top();
                stk.pop();
                res.emplace_back(cur->val);
                cur = cur->right;
            }
        }
        return res;
    }
};

