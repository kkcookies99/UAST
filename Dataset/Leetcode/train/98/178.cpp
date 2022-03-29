 class Solution {
public:
vector<int> res;
void travel(TreeNode* root)
{
    if(root==nullptr) return;
    travel(root->left);
    res.push_back(root->val);
    travel(root->right);
}
bool XXX(TreeNode* root) {
    if(root==nullptr) return true;
    travel(root);
    for(int i=1;i<res.size();i++)
    {
        if(res[i]<=res[i-1])
        {
            return false;
        }
    }
    return true;
}

