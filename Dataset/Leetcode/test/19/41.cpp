 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* preNode = new ListNode();
        preNode->next = head;
        ListNode* fast = preNode, *slow = preNode, *pre = preNode;
        for(int i = 0; i < n - 1; i++)
        {
            fast = fast->next;
        }
        while(fast->next)
        {   if(slow != preNode)
                pre = pre->next;
            fast = fast->next;
            slow = slow->next;
        }
        pre->next = pre->next->next;
        return preNode->next;
    }
};

