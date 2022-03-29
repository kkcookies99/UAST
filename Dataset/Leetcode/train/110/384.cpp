class Solution {
public:
    int get_height(TreeNode* node){
        if(node==nullptr)
            return 0;
        int left_height=get_height(node->left);
        int right_height=get_height(node->right);
        return max(left_height,right_height)+1;
    }
    bool XXX(TreeNode* root) {
        if(root==nullptr)
        {
            return true;
        }
        int res=abs(get_height(root->left)-get_height(root->right));
        if(res>1)
            return false;
        return XXX(root->left)&&XXX(root->right);
        
    }
};

