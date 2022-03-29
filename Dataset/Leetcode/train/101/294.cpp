 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == nullptr) return true;
        return isEqual(root->left,root->right);
    }

    bool isEqual(TreeNode* p, TreeNode* q)
    {
        if(p == nullptr && q == nullptr) return true;
        if(p == nullptr || q == nullptr || (p->val != q->val)) return false;
        return isEqual(p->left, q->right) && isEqual(p->right, q->left);
    }

};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


