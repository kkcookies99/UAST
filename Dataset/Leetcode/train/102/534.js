var XXX = function(root) {
    const dfs = (res, root, height) => {
        if (!root) return;
        if (height >= res.length) res.push([]);
        res[height].push(root.val);
        dfs(res, root.left, height + 1);
        dfs(res, root.right, height + 1);
    }
    const res = [];
    dfs(res, root, 0);
    return res;
};

