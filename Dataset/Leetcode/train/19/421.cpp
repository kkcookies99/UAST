 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        if (n==0 || head==nullptr)
            return head;
        ListNode* dummyHead = new ListNode(-1); // 前驱节点，哑节点
        dummyHead->next = head;
        ListNode* slow = dummyHead;
        ListNode* fast = dummyHead;
        while (n--)
        {// fast先走n步
            fast = fast->next;
            if (fast == nullptr)
                return head; // eg：总计5个节点，要删除倒数第6个
        }
        while (fast->next) // 此时fast一定不为nullptr
        { // slow后走
          // 若比喻成赛跑，n为1，删除倒数第一个
          // fast-1m，slw-0m，fast-100m，slow-99m
          // slow处在倒数第二，可用slow-next==slow->next-next删除倒数第一
            slow = slow->next;
            fast = fast->next;
        }
        ListNode* del = slow->next;
        slow->next = slow->next->next;
        delete del;
        ListNode* ret = dummyHead->next; // 以防head被删除了
        delete dummyHead;
        return ret;
    }
};

