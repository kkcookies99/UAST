class Solution {
public:
  // DFS
  vector<vector<int>> XXX(TreeNode* root) {
    vector<vector<int>> ans;
    DFS(root, 0, ans);
    return ans;
  }

  // 使用滚动数组来实现BFS
  vector<vector<int>> XXXII(TreeNode* root) {
    // corner case
    if (!root) return {};

    vector<TreeNode*> curr{root}, next;

    vector<vector<int>> ans;
    while (not curr.empty()) {
      ans.emplace_back();
      for (const auto& node : curr) {
        ans.back().emplace_back(node->val);
        if (node->left)  next.emplace_back(node->left);
        if (node->right) next.emplace_back(node->right);
      }
      curr.swap(next);
      next.clear();
    }

    return ans;
  }

  // 使用队列来实现BFS
  vector<vector<int>> XXXIII(TreeNode* root) {
    // corner case
    if (!root) return {};

    queue<TreeNode*> q{{root}};

    vector<vector<int>> ans;
    while (not q.empty()) {
      ans.emplace_back();
      size_t s = q.size();
      while (s--) {
        auto cur = q.front(); q.pop();
        ans.back().emplace_back(cur->val);
        if (cur->left)  q.emplace(cur->left);
        if (cur->right) q.emplace(cur->right);
      }
    }

    return ans;
  }

private:
  void DFS(TreeNode* root, int depth, vector<vector<int>>& ans) {
    if (!root) return;
    if (ans.size() <= depth) // works with pre/in/post-order
      ans.emplace_back();
    DFS(root->left, depth + 1, ans);
    DFS(root->right, depth + 1, ans);
    ans[depth].emplace_back(root->val);
  }
};

