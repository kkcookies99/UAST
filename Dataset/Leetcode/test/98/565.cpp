 class Solution {
public:
    vector<int>temp;
    bool XXX(TreeNode* root) {
        if(!root){return true;}
        travel(root);
        for(int i=1;i<temp.size();i++)
        {
            if(temp[i]<=temp[i-1])
            {return false;}
        }
        return true;
    }
    void travel(TreeNode* root)
    {
        if(root)
        {
            travel(root->left);
            temp.push_back(root->val);
            travel(root->right);
        }
    }
};

