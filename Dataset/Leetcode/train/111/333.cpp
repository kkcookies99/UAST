class Solution {
public:
    int XXX(TreeNode* root) {
        if(root == NULL)
            return 0;
        queue<pair<TreeNode*,int>> q;
        q.push(make_pair(root,1));
        while(!q.empty()){
            TreeNode* node = q.front().first;
            int level = q.front().second;
            q.pop();

            if(node->left == NULL && node->right == NULL)
                return level;
            if(node->left )q.push(make_pair(node->left,level+1));
            if(node->right )q.push(make_pair(node->right,level+1));
        }
        return INT_MAX;
    }
};

