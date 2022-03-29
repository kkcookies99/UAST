 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)
            return true;

        bool leftFlag = false, rightFlag = false;

        if(!root->left || (XXX(root->left) && maxValue(root->left) < root->val))
            leftFlag = true;

        if(!root->right || (XXX(root->right) && minValue(root->right) > root->val))
            rightFlag = true;
        
        return leftFlag && rightFlag;
    }

    int minValue(TreeNode* pNode){
        if(!pNode)
            return INT_MAX;
        return min(min(minValue(pNode->left), minValue(pNode->right)), pNode->val);
    }

    int maxValue(TreeNode* pNode){
        if(!pNode)
            return INT_MIN;
        return max(max(maxValue(pNode->left), maxValue(pNode->right)), pNode->val);
    }
};

