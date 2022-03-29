class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)
            return true;
        int a = maxHeight(root);
     
        int b = minHeight(root);
        
        if(a-b > 1 )
            return false;

        return true;
    }

    int minHeight(TreeNode* node){
        if(!node)
            return 0;
        else{
            return min(minHeight(node->left),minHeight(node->right))+1;
        }
    }

    int maxHeight(TreeNode* node){
        if(!node)
            return 0;
        else{
            return max(maxHeight(node->left),maxHeight(node->right))+1;
        }
    }
};

