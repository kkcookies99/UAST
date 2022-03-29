 class Solution {
public:
    void getnum(TreeNode* root, vector<int>& res) {
        if (!root) return;
        getnum(root->left, res);
        res.push_back(root->val);
        getnum(root->right, res);
    }
    bool XXX(TreeNode* root) {
        vector<int> res;
        getnum(root, res);
        int n = res[0];
        for (int i = 1; i < res.size(); i++) {
            if (n < res[i]) {
                n = res[i];
            }
            else {
                return false;
            }
        }
        return true;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


