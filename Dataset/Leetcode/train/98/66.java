 class Solution {
    stack<TreeNode*> s;
    long pre=LONG_MIN;
public:
    bool XXX(TreeNode* root) {
        while(true){
            while(root){s.push(root);root=root->left;}
            if(s.empty())break;
            root=s.top();s.pop();
            if(root->val<=pre)return false;
            pre=root->val;
            root=root->right;
        }
        return true;
    }
};

