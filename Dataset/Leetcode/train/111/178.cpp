class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root)
            return 0;
        int n=1;
        queue<TreeNode*> que;
        TreeNode *last=nullptr,*nlast=root;
        que.push(root);
        while(!que.empty())
        {
            TreeNode *cur=que.front();
            que.pop();
            if(!cur->left&&!cur->right)
                break;
            if(cur->left)
            {
                last=cur->left;
                que.push(cur->left);
            }
            if(cur->right)
            {
                last=cur->right;
                que.push(cur->right);
            }
            if(cur==nlast)
            {
                nlast=last;
                n++;
            }
        }
        return n;
    }
};

