 class Solution {
public:
    bool XXX(TreeNode* p, TreeNode* q) {
        if(p==NULL&&q==NULL)    return true;
        else if(p==NULL||q==NULL)   return false;
        else if(p->val!=q->val) return false;
        if (!XXX(p->left,q->left))    return false;
        if (!XXX(p->right,q->right))    return false;
        return true;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


