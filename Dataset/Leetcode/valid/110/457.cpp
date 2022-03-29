class Solution {
public:
    bool flag;
    
    bool XXX(TreeNode* root) {
        flag = true;
        travel(root);
        return flag;
    }
    
    int travel(TreeNode* root){
        if(flag){
            if(root == nullptr)
                return 0;
            int left = travel(root->left);
            int right = travel(root->right);
            
            if(abs(right-left) >= 2){
                flag = false;
                return -1;
            }
            return 1 + max(left, right);
        }
        return -1;
    }
    
};

