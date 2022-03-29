 class Solution {
public:
    vector<int> nodeNum;
    bool XXX(TreeNode* root) {
        if(root == nullptr) return true;
        inorder(root);
        for(int i = 1; i < nodeNum.size(); ++i)
            if(nodeNum[i - 1] >= nodeNum[i])
                return false;
        return true;
    }
    void inorder(TreeNode* node) {
        if(node->left) inorder(node->left);
        nodeNum.push_back(node->val);
        if(node->right) inorder(node->right);
    }
};

