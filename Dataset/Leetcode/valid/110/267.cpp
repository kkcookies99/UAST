class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)
        {
            return true;
        }
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty())
        {
            TreeNode* temp = q.front();
            q.pop();
            if(temp->left && temp->right)
            {
                q.push(temp->left);
                q.push(temp->right);
                if(maxHeight(temp->left)-maxHeight(temp->right)>1 ||
                maxHeight(temp->left)-maxHeight(temp->right)<-1)
                {
                    return false;
                }
            }
            else if(!temp->left && temp->right)
            {
                q.push(temp->right);
                if(maxHeight(temp->right)>1)
                {
                    return false;
                }
            }
            else if(!temp->right && temp->left)
            {
                q.push(temp->left);
                if(maxHeight(temp->left)>1)
                {
                    return false;
                }
            }
        }
        return true;
    }
    int maxHeight(TreeNode* root)
    {
        if(!root)
        {
            return 0;
        }
        int height = max(maxHeight(root->left), maxHeight(root->right)) + 1;
        return height;
    }
};

