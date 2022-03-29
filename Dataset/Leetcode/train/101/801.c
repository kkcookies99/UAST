 bool XXX(struct TreeNode* root){
    struct TreeNode* ltree;
    struct TreeNode* rtree;
    Queue queue;

    if (root == NULL) return true;

    InitQueue(&queue);

    PushQueue(&queue, root);
    PushQueue(&queue, root);

    while (!IsEmpty(&queue)) {
        if (!PopQueue(&queue, &ltree)) return false;
        if (!PopQueue(&queue, &rtree)) return false;

        if (ltree == NULL && rtree == NULL) continue;
        if (ltree == NULL || rtree == NULL) return false;
        if (ltree->val != rtree->val) return false;

        PushQueue(&queue, ltree->left);
        PushQueue(&queue, rtree->right);
        PushQueue(&queue, ltree->right);
        PushQueue(&queue, rtree->left);
    }
    return true;
}

