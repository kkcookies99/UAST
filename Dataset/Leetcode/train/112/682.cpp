 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(!root) return false;
        queue<pair<TreeNode*,int>> queue;
        queue.push(make_pair(root,root->val));
        while(!queue.empty()){
            TreeNode* node=queue.front().first;
            int res=queue.front().second;
            queue.pop();
            if(!node->left&&!node->right){
                if(res==sum)
                return true;
            }
            if(node->left){
                queue.push(make_pair(node->left,res+node->left->val));
            }
            if(node->right){
                queue.push(make_pair(node->right,res+node->right->val));
            }
        }
        return false;
    }
};

