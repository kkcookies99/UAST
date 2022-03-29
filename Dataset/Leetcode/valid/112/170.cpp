class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        // base case 
        if (root == nullptr) return false; 
        // pre order traversal, visit, left, right 
        if (root->left == nullptr && root->right == nullptr) {
            if (root->val == targetSum)
                return true; 
        }
        bool leftFlag = false, rightFlag = false; 
        if (root->left != nullptr)
            leftFlag = XXX(root->left, targetSum - root->val);
        if (root->right != nullptr)
            rightFlag = XXX(root->right, targetSum - root->val);
        return leftFlag || rightFlag; 
    }
};

