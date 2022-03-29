 class Solution {
public:
    bool XXX(TreeNode* root) 
    {
        if(!root) return true;
        return dfs(root,LONG_MIN,LONG_MAX);
        //return dfs(root);//方法2
    }
//2021.9.11
//思考当前节点怎么做，左儿子小于当前节点，右儿子大于当前节点。
//根据BST定义：若当前节点是其父的左，那当前节点的右儿子应该小于其父；若当前节点是其父的右，那当前节点的左儿子应该大于其父；
//这个父节点的值约束怎么传下去，递归只能保存相邻一层信息，决定加个参数传下去
//以上想法错了，不要想其爷爷可以约束孙子的取值就没问题，孙子完全有可能不满足太爷爷
/*    10
          14
        13
     9
*///如上图9虽然比其爷爷小，但是比太爷爷大    
//也就是说仅仅靠其爷爷一个值约束是不够的，怎么把其所有祖先全部加入约束条件呢？或者说我们怎么用一个正确的区间值取约束呢，见方法1

//方法1： 每次向下递归都限制其最小值与最大值，如上图例子，我们在向10的右子树遍历时就约束好其右子树的下界应大于10，所以9不会符合
    bool dfs(TreeNode *root,long long minborder,long long maxborder)
    {
        if(!root) 
            return true;
        if(root->val<=minborder || root->val>=maxborder)
            return false;
        return dfs(root->left,minborder,root->val) && dfs(root->right,root->val,maxborder);
    }
//方法2：时刻不要忘记BST中序的性质：中序遍历序列是递增的
    long long pre = LONG_MIN;//longlong最小值的写法
    bool dfs(TreeNode* root)
    {
        if(!root)  return true;
        bool left = dfs(root->left);//要返回值正如代码随想录所说，如果不用全搜索完整颗树，那就需要返回值
        if(pre < root->val)
            pre = root->val;
        else
            return false;
        bool right = dfs(root->right);
        return left && right;
    }
};

