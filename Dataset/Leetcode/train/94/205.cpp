 class Solution {
public:
    vector<int> XXX(TreeNode* root) {
    vector<int> nums;
    if(root!=NULL){
    vector<int> left=XXX(root->left);
    for(int i=0;i<left.size();i++) nums.push_back(left[i]);
    nums.push_back(root->val);
    vector<int> right= XXX(root->right);
    for(int i=0;i<right.size();i++) nums.push_back(right[i]);
    }
    return nums;
    }
};

