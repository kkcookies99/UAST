 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root == nullptr)
            return true;
        return fun(root,root);
    }
    bool fun(TreeNode *p1,TreeNode *p2)
    {
        if(p1 == nullptr && p2 == nullptr)  //p1 p2 都空指针 返回true
            return true;
        if(p1 == nullptr || p2 == nullptr)  //只有一个空指针 返回false
            return false;
        if(p1->val != p2->val)              //值不相同 返回false
            return false;
        return fun(p1->right,p2->left) && fun(p2->right,p1->left);
    }
};
```打卡

