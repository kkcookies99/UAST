class Solution {
public:
    bool treeHigh(TreeNode * root, int &high){
        if (root == nullptr){
            high = 0;
            return true;
        }
        int leftHigh = 0;
        if (!treeHigh(root->left, leftHigh)){
            return false;
        }
        int rightHigh = 0;
        if (!treeHigh(root->right, rightHigh)){
            return false;
        }
        if (abs(leftHigh - rightHigh) >= 2){  
            return false;
        }
        high = max(leftHigh, rightHigh) + 1;
        return true;
    }
    bool XXX(TreeNode* root) {
        int high = 0;
        return treeHigh(root, high);
    }
};

