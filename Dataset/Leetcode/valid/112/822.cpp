 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(!root) return false;
        stack<TreeNode*> s;
        s.push(root);

        while(!s.empty()) {
            auto n=s.top();
            s.pop();
            auto nr=n->right;
            auto nl=n->left;
            if(nr) {
                s.push(nr);
                nr->val+=n->val;
            } 
            if(nl) {
                s.push(nl);
                nl->val+=n->val;
            } 
            if(!nl && !nr && n->val==sum) {
                return true;
            }
        }
        return false;
    }
};

