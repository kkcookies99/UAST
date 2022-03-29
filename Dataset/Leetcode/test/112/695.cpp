 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root==NULL)
            return false;
        stack<TreeNode*> s;
        stack<int> n;
        TreeNode *curr=root;
        int currsum=0;
        s.push(curr);
        n.push(curr->val);
        while(!s.empty()){
            curr=s.top();
            currsum=n.top();
            s.pop();
            n.pop();
            if(curr->left==NULL&&curr->right==NULL&&currsum==sum)
                return true;
            if(curr->right!=NULL){
                s.push(curr->right);
                n.push(currsum+curr->right->val);
            }
            if(curr->left!=NULL){
                s.push(curr->left);
                n.push(currsum+curr->left->val);
            }  
        }
        return false;
    }
    
};

