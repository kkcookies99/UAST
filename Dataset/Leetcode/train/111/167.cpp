class Solution {
public:
    int XXX(TreeNode* root) {
        if(root==nullptr)return 0;
        int res = INT_MAX;
        XXX(root,1,res);
        return res;
    }
    void XXX(TreeNode* root,const int& curr,int&min)
    {
        if(root==nullptr||curr>min)return;
        else if(root->left==nullptr&&root->right==nullptr)
        {
             min = std::min(min,curr);
             return;
        }else{
            XXX(root->left,curr+1,min);
            XXX(root->right,curr+1,min);
        }
    }
};

