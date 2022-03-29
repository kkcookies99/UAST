 class Solution {
public:
    bool XXX(TreeNode* root, int sum) {
        if(root==NULL)
            return false;
        stack<TreeNode*> s;
        stack<int> n;
        TreeNode *curr=root;
        int currsum=0;
        while(!s.empty()||curr!=NULL){
            while(curr!=NULL){
                s.push(curr);
                currsum+=curr->val;
                n.push(currsum);
                curr=curr->left;
            }
            curr=s.top();
            currsum=n.top();
            s.pop();
            n.pop();
            if(curr->left==NULL&&curr->right==NULL&&currsum==sum)
                return true;
            curr=curr->right;
        }
        return false;
    }
};

