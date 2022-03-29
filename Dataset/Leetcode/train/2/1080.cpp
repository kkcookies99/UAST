 class Solution {
public:
    ListNode* XXX(ListNode* p, ListNode* q) {
        ListNode head;  // 辅助头节点，用于简化链表的添加操作：
        ListNode* tail = &head; // 指向辅助节点，这样的好处是：
            // 循环中添加第一个节点和添加后续节点的操作完全相同
        int carry = 0; // 用于保存按位累加的结果
        while (p || q) { // 只要有一个链表还没便利完，就继续
            int a = p ? p->val : 0; // 第一个链表的数字，如果没有数字算0
            int b = q ? q->val : 0; // 第二个链表的数字
            carry = carry + a + b;  // 求和
            int c = carry % 10; // 计算结果数字
            carry /= 10;        // 保存进位值
            tail->next = new ListNode(c); // 生成新节点到结果链表上
            tail = tail->next;  // 指针后移
            if (p) p = p->next; // 指针后移
            if (q) q = q->next; // 指针后移
        }
        if (carry) { // 进位不为0，加到结果上
            tail->next = new ListNode(carry);
        }
        return head.next;
    }
};

