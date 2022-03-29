 class Solution {
public:
    //快慢指针：快指针比慢指针超前n个结点,当快指针指向链表尾结点的时候慢指针刚好指向待删除结点的前驱结点
    ListNode* XXX(ListNode* head, int n) {
        // 构造链表头结点
        ListNode *slow, *fast, *d, *t = new ListNode();
        t->next = head;
        // 初始化快慢指针
        fast = slow = t;
        while(n--){
            fast = fast->next;
        }
        // 快慢指针遍历链表
        while(fast->next){
            slow = slow->next;
            fast = fast->next;
        }
        // 删除结点
        d = slow->next;
        slow->next = slow->next->next;
        delete d;
        // 返回没有头结点的链表
        return t->next;
    }
};

