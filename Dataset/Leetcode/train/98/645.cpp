 class Solution {
public:
    vector<int> res;
    unordered_map<int, int> hash;
    bool XXX(TreeNode* root) {
        inOrder(root);
        vector<int> temp(res);
        sort(temp.begin(), temp.end());
        for (int i = 0; i < temp.size(); i++) {
            cout << hash[res[i]] << endl;
            if (hash[res[i]] > 1 || res[i] != temp[i]) return false;
        }
        return true;
    }

    void inOrder(TreeNode* root) {
        if (!root) return;
        inOrder(root->left);
        hash[root->val]++;
        res.push_back(root->val);
        inOrder(root->right);
    }
};

