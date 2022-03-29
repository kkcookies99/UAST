 class Solution {
public:
    bool XXX(TreeNode* root) {
        if(root==NULL||isleaf(root))
         return true;
        vector<int> l;
        vector<int> r;
        if(root->left==NULL||root->right==NULL)
        return false;
        if(root->left->val!=root->right->val)
        return false;
        leftpush(root->left,l);
        rightpush(root->right,r);
        if(l.size()!=r.size())
        return false;
        for(int i=0;i<l.size();i++){
            if(l[i]!=r[i])
            return false;
        }
        return true;
    }

    bool isleaf(TreeNode* root){
         return root->left==NULL&&root->right==NULL;
    }

    void leftpush(TreeNode* root,vector<int>& a){
        a.push_back(root->val);
        if(root->left!=NULL)
        leftpush(root->left,a);
        else
        a.push_back(-1);
        if(root->right!=NULL)
        leftpush(root->right,a);
        else
        a.push_back(-1);
    }

    void rightpush(TreeNode* root,vector<int>& a){
        a.push_back(root->val);
        if(root->right!=NULL)
        rightpush(root->right,a);
        else a.push_back(-1);
        if(root->left!=NULL)
        rightpush(root->left,a);
        else a.push_back(-1);
    }
};

