 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(!root)
            return true;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty())
        {
            int len = q.size();
            vector<TreeNode*> L;
            for(int i=0;i<len;i++)
            {
                TreeNode* front = q.front();
                q.pop();
                if(front->left)
                {
                    q.push(front->left);
                    L.push_back(front->left);
                }
                else
                    L.push_back(NULL);
                if(front->right)
                {
                    q.push(front->right);
                    L.push_back(front->right);
                }
                else
                    L.push_back(NULL);
            }
            for(int i=0;i<L.size()/2;i++)
            {
                if(!L[i] && !L[L.size()-i-1])
                    continue;
                else if(!L[i] || !L[L.size()-i-1])
                    return false;
                else if(L[i]->val!=L[L.size()-i-1]->val)
                    return false;
            }
        }
        return true;
    }
};

