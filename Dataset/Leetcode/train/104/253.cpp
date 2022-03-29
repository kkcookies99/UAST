class Solution {
public:
    int XXX(TreeNode* root) {

        if (root == NULL) return 0;

        queue <TreeNode*> q;
        q.push(root);
        int ans = 0;
        while (q.empty() != true) {
            int s = q.size();
            while (s > 0) {
                root = q.front();
                if (root->left  != NULL) q.push(root->left);
                if (root->right != NULL) q.push(root->right);
                s--;
                q.pop();
            }
            ans++;
        }

        return ans;
    }
};

