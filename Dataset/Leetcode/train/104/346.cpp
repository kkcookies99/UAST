class Solution {
public:
  // Recursive Sol
  int XXX(TreeNode* root) {
    if (!root) return 0;
    return 1 + max(XXX(root->left), XXX(root->right));
  }

  // 使用了没有递归思想的递归解法, 本质上还是线性思维！
  int XXXII(TreeNode* root) {
    int ans = 0;
    traverse(root, 1, ans);
    return ans;
  }

  // Breadth First Search Algorithm
  int XXXIII(TreeNode* root) {
    // corner case
    if (!root) return 0;

    vector<TreeNode*> curr{root}, next;
    
    int depth = 0;
    while (not curr.empty()) {
      for (const auto& node : curr) {
        if (node->left)  next.emplace_back(node->left);
        if (node->right) next.emplace_back(node->right);
      }
      curr.swap(next);
      next.clear();
      ++depth;
    }

    return depth;
  }

private:

  void traverse(TreeNode* root, int depth, int& ans) {
    if (!root) return;
    if (depth > ans) ans = depth;
    traverse(root->left,  depth + 1, ans);
    traverse(root->right, depth + 1, ans);
  }
};

