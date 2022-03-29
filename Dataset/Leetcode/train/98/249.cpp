 class Solution {
public:
    bool InOrder(TreeNode* root, int& prev, bool& init_flag){
        if(!root){
            return true;
        }
        bool left = InOrder(root->left, prev, init_flag);
        if(init_flag==false) init_flag = true; 
        else if(root->val<=prev) return false;
        prev = root->val;
        bool right = InOrder(root->right,prev, init_flag);
        return left&&right;
    }
    bool XXX(TreeNode* root) {
        int prev;
        bool init_flag = false;
        return InOrder(root, prev, init_flag);
        
    }
};

