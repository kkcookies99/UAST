 class Solution {
public:
    ListNode* XXX(ListNode* head, int& n) {    /* 首先将参数的n改为引用 */
        if(!head) return head;      /* 递归的边界 */
        head->next = XXX(head->next, n);   /* 递归, 注意n是引用 */
        return --n?head:head->next; /* 由于递归, 执行此语句时相当于逆向遍历, 当--n==0时就是要删除的节点 */
    }
};

