 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(!root) return false;
        stack<TreeNode*> s;
        s.push(root);
        while(!s.empty()){
            TreeNode* top = s.top();
            s.pop();
            if((!top->left)&&(!top->right) && top->val == sum) return true;
            if(top->left){
                top->left->val += top->val;
                s.push(top->left);
            }
            if(top->right){
                top->right->val += top->val;
                s.push(top->right);
            }
        }
        return false;
    }
};

