 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode* flagHead = new ListNode(0);  // 虚头结点
        flagHead->next = head;
        ListNode *slow=flagHead,*fast=flagHead;
        while(n--) {
            fast = fast->next;
        }
        while(fast->next!=NULL) {
            fast = fast->next;
            slow =  slow->next;
        }
        slow->next = slow->next->next;
        return flagHead->next;
    }
};

