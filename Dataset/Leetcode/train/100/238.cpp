 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(!p && !q)
            return true;
        if(!!p != !!q || p->val != q->val)
            return false;
        
        if(!XXX(p->right, q->right) || !XXX(p->left, q->left))
            return false;

        return true;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


