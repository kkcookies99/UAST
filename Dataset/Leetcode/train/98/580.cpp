 class Solution {
public:
    bool XXX(TreeNode* root) {
        return XXX_cond(root, {});
    }
private:
    struct Condition {
        optional<int> upperlimit {};
        optional<int> lowerlimit {};
    };
    bool XXX_cond(TreeNode const * const root, Condition const cond) const noexcept {
        if (!root) 
          {
            return true;
          }
        if (
            (cond.upperlimit && (root -> val) >= cond.upperlimit) 
            || (cond.lowerlimit && (root -> val) <= cond.lowerlimit)
        ) 
          {
            return false;
          }

        return 
        (XXX_cond(root -> left, {root -> val, cond.lowerlimit}) 
        && XXX_cond(root -> right, {cond.upperlimit, root -> val}));
    }
};

