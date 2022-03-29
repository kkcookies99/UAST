class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root) return 0;
        queue<TreeNode*> q;
        q.push(root);
        int res = 0;
        while(!q.empty())
        {
            int size = q.size();
            while(size--)
            {
                TreeNode* pre = q.front();
                q.pop();
                if(pre->left) q.push(pre->left);
                if(pre->right) q.push(pre->right);
            }
            ++res;
        }
        return res;
    }
};


