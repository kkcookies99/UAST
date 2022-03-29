class Solution {
public:
    int XXX(TreeNode* root) {
        if(!root) return 0;
        int depth=1;
        queue<TreeNode*> q;
        if(root) q.push(root);
        while(!q.empty()){
            for(int i=q.size()-1;i>-1;--i){
                TreeNode* node=q.front();
                q.pop();
                if(!node->left&&!node->right)
                    return depth;
                if(node->left) q.push(node->left);
                if(node->right) q.push(node->right);
            }
            ++depth;
        }
        return -1;
    }
};

