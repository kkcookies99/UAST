 class Solution {
public:
    bool getsum(TreeNode* root, int sum, int targetSum){
        if(root!=nullptr){
        sum+=root->val;
        if(!root->left && !root->right){
            if(sum == targetSum) return true;
        }
        else{
            bool left = getsum(root->left,sum,targetSum);
            if(left) return left;
            bool right = getsum(root->right,sum,targetSum);
            if(right) return right;
            }
        }
        return false;
    }

    bool XXX(TreeNode* root, int targetSum) {
        int sum = 0;
        if(root == nullptr) return false;
        return getsum(root, sum, targetSum);
    }
};

