 class Solution {
public:
    bool XXX(TreeNode* root) {
        judge(root);
        for(int i=0; i<res.size()-1; i++) {
            if(res[i] >= res[i+1])  return false;
        }
        return true;

    }
    void judge(TreeNode* root)  {
        if(root->left)  judge(root->left);
        res.push_back(root->val);
        if(root->right) judge(root->right);
    }
private:
    vector<int> res;
};

