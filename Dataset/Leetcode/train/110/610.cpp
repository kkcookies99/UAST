 class Solution {
public:
    int get_height(TreeNode* node){
        if(!node)
            return 0;
        
        int left = get_height(node->left);
        int right = get_height(node->right);

        if(abs(left - right) > 1 || left == -1 || right == -1)
            return -1;
        
        return max(left, right) + 1;
    }

    bool XXX(TreeNode* root) {
        return get_height(root) != -1;
    }
};

