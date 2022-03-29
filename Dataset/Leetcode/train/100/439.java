     public boolean XXX(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        int pTop = -1;
        int qTop = -1;
        TreeNode[] pStack = new TreeNode[101];
        TreeNode[] qStack = new TreeNode[101];
        TreeNode pCur = p;
        TreeNode qCur = q;
        while ((pCur != null || pTop != -1) && (qCur != null || qTop != -1)) {
            if (pCur != null && qCur != null) {
                pStack[++pTop] = pCur;
                qStack[++qTop] = qCur;
                pCur = pCur.left;
                qCur = qCur.left;
            } else if (pCur == null && qCur == null) {
                pCur = pStack[pTop--];
                qCur = qStack[qTop--];
                if (pCur.val != qCur.val) {
                    return false;
                }
                pCur = pCur.right;
                qCur = qCur.right;
            } else {
                return false;
            }
        }
        return pTop == -1 && qTop == -1 && pCur == null && qCur == null;
    }

