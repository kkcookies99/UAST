 class Solution {
private:
    bool helper(TreeNode* node, long long lower, long long upper){
        if(node == NULL){
            return true;
        }
        if(node->val <= lower || node->val >= upper){
            return false;
        }
        return helper(node->left, lower, node->val) && helper(node->right, node->val, upper);
    }
public:
    bool XXX(TreeNode* root) {
        //return helper(root, LONG_LONG_MIN, LONG_LONG_MAX);
        stack<TreeNode*> stk;
        if(root == NULL)
            return true;
        long long res = LONG_LONG_MIN;
        TreeNode* node = root;
        while(!stk.empty() || node != NULL){
            while(node != NULL){
                stk.push(node);
                node = node->left;
            }
            node = stk.top();
            if(res >= node->val){
                return false;
            }
            res = node->val;
            stk.pop();
            node = node->right;
        }
        return true;
    }
};

