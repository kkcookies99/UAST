 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        stack<TreeNode*> stk;
        TreeNode* tmp=root;
        int res = 0;
        while(tmp || !stk.empty()){
            if(tmp){
                stk.push(tmp);
                if(tmp->left) tmp->left->val += tmp->val;
                if(tmp->right) tmp->right->val += tmp->val;
                tmp = tmp->left;
            }
            else{
                tmp = stk.top();
                stk.pop();
                if(tmp->left==NULL && tmp->right==NULL && tmp->val==sum) return true;
                tmp = tmp->right;
            }
        }
        return false;
    }
};

