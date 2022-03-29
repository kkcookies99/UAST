class Solution {
public:
    int getHeight(TreeNode* root){
        // naive func to count the height of each node
        // if (root == nullptr)
        //     return 0;
        // return 1+max(getHeight(root->left), getHeight(root->right));

        // how about judging balance meanwhile counting the height?
        if (root == nullptr)
            return 0;
        int left_height = getHeight(root->left);
        int right_height = getHeight(root->right);
        
        // if the child node is unbalanced, return -1; 
        if (left_height == -1 || right_height == -1)
            return -1;
        else if (abs(left_height-right_height)>1)
            return -1;
        else return 1+max(left_height, right_height); 
    }
    bool XXX(TreeNode* root) {
        return getHeight(root) > -1;
        // if (root == nullptr)
        //     return true;
        // if (abs(getHeight(root->left)-getHeight(root->right)) > 1)
        //     return false;
        // return XXX(root->left) && XXX(root->right);

    }
};
