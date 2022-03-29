 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == nullptr) return true;
        stack<TreeNode*> s;
        long long pre = (long long)INT_MIN - 1;
        TreeNode* p = root;
        while(!s.empty() || p) {
            //有左子树，左子树一直入栈
            while(p) { 
                s.push(p);
                p = p->left;
            }
            if(!s.empty()) {
                //根结点
                p = s.top();
                s.pop();
                if(p->val <= pre) {
                    return false;
                }
                pre = p->val;
                //右子树
                p = p->right;
            }
        }
        return true;
    }
};

