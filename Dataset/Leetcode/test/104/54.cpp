class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == NULL) return 0;
        int height = 0;
        queue<TreeNode*> q;
        q.push(root);
        TreeNode* p = NULL , *lastNode = root;
        while(!q.empty())
        {
            p=q.front();
            q.pop();
            
            if(p->left != NULL)
                q.push(p->left);
            if(p->right != NULL)
                q.push(p->right);
            
            if(lastNode == p)
            {
                height ++;
                lastNode = q.back();
            }
        }
        return height;
    }
};

