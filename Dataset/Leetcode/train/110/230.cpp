class Solution {
public:
    int height(TreeNode* root1)  //计算节点的高度
    {
        if(root1 == NULL) return 0;
        else if(root1->left == NULL && root1->right == NULL) return 1;
        else return max(height(root1->left), height(root1->right)) + 1;
    }
    bool XXX(TreeNode* root) {
        if(root == NULL || (root->left == NULL && root->right == NULL)) return true;
        if(abs(height(root->left) - height(root->right)) > 1) return false;
        return XXX(root->left) && XXX(root->right);
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


