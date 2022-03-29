class Solution {
public:
    bool XXX(TreeNode* root, int targetSum) {
        if(root==nullptr) return false;
        queue<pair<TreeNode*,int>> que;
        que.push(pair<TreeNode*,int>(root,root->val));
        while(!que.empty()){
            pair<TreeNode*,int>node=que.front();
            que.pop();
            if(!node.first->left&&!node.first->right&&node.second==targetSum) return true;
            if(node.first->left){
                que.push(pair<TreeNode*,int>(node.first->left,node.second+node.first->left->val));
            }
            if(node.first->right){
                que.push(pair<TreeNode*,int>(node.first->right,node.second+node.first->right->val));
            }
        }
        return false;
    }
};

