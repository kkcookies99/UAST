 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==nullptr)return true;
        deque<TreeNode*>q;
        q.push_back(root->left);
        q.push_back(root->right);
        while(!q.empty())
        {
            TreeNode*t1=q.front();
            q.pop_front();
            TreeNode*t2=q.front();
            q.pop_front();
            if(t1==nullptr&&t2==nullptr)continue;
            if(t1==nullptr||t2==nullptr)return false;
            if(t1->val!=t2->val)return false;
            q.push_back(t1->left);
            q.push_back(t2->right);
            q.push_back(t1->right);
            q.push_back(t2->left);
        }
        return true;
    }
};

