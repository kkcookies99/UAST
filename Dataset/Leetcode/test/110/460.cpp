class Solution {
public:
    bool XXX(TreeNode* root) {
        return recur(root) != -1;
    }
    int recur(TreeNode *root){
        if(root == NULL) return 0;
        int left = recur(root->left);
        if(left == -1) return -1;
        int right = recur(root->right);
        if(right == -1) return -1;
        cout << "根结点值：" << root->val << "。左右深度为分别是，";
        cout << "left:" << left << ",right:" << right << endl;
        return abs(left - right) <= 1 ? 1 + max(left, right) : -1;
    }
};

