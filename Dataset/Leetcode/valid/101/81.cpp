 class Solution {
public:
    bool XXX(TreeNode* root) {
        queue<TreeNode *> d1,d2;
        d1.push(root);
        d2.push(root);
        TreeNode *p1, *p2;
        while(!d1.empty() && !d2.empty())
        {
            p1 = d1.front();
            p2 = d2.front();
            d1.pop();
            d2.pop();
            if(p1 == nullptr && p2 ==nullptr)
                continue;
            else if(p1 == nullptr || p2 == nullptr)
                return false;
            if(p1->val != p2->val)
                return false;
            d1.push(p1->right);
            d1.push(p1->left);
            d2.push(p2->left);
            d2.push(p2->right);
        }
        return true;
    }
};打卡 迭代

