class Solution {
public:
    int XXX(TreeNode* root) {
        if(root==nullptr)
            return 0;
        queue<TreeNode*> q;
        q.push(root);
        int dep=1;
        while(!q.empty()){
            int sz=q.size();
            for(int i=0;i<sz;i++){
                TreeNode* cur=q.front();
                q.pop();
                if(cur->left==nullptr && cur->right==nullptr)
                    return dep;
                if(cur->left!=nullptr)
                    q.push(cur->left);
                if(cur->right!=nullptr)
                    q.push(cur->right);
            }
                dep++;
        }
        return dep;
    }
};

