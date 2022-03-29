 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
        vector<int> res;
        stack<TreeNode*> stack;
        TreeNode *curr=root,*node;
        while(!stack.empty()||curr!=NULL){
            while(curr!=NULL){
                stack.push(curr);
                curr=curr->left;
            }
            node = stack.top();stack.pop();res.push_back(node->val);
            if(node->right!=NULL){
                curr=node->right;
            }
        }
        return res;
    }
};

