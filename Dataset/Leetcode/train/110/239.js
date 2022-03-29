var XXX = function(root) {
    let sys = true
    function calDep(root) {
        if(!root) return 0;
        const depL = calDep(root.left) + 1;
        const depR = calDep(root.right) + 1;
        sys = sys && Math.abs(depL - depR) < 2;
        return Math.max(depL, depR);
    }
    calDep(root);

    return sys;
};

