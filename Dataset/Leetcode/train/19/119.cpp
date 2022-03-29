 class Solution {
public:
    ListNode* XXX(ListNode* head, int n) {
        ListNode *xuniHead = new ListNode(0,nullptr);
        xuniHead->next = head;
        ListNode *slow = xuniHead;
        ListNode *fast = xuniHead;
        while(n--){
            fast = fast->next;
        }
        fast = fast->next;
        while(fast!=NULL){
            slow = slow->next;
            fast = fast->next;
        }
        slow->next = slow->next->next;
        return xuniHead->next;
    }
};

