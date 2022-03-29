 class Solution {
private:
    void inorder(vector<int> &nums, TreeNode *root) {
        if (root == nullptr) {
            return;
        }
        inorder(nums, root->left);
        nums.push_back(root->val);
        inorder(nums, root->right);
    }
public:
    bool XXX(TreeNode* root) {
        vector<int> nums;
        inorder(nums, root);
        for (int i = 1; i < nums.size(); i++) {
            if (nums[i] <= nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


