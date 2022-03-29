class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode head;
        ListNode* tail = &head;
        int sum = 0;
        while(l1 || l2){
            if(l1){
                sum += l1->val;
                l1 = l1->next;
            }
            if(l2){
                sum += l2->val;
                l2 = l2->next;
            }
            tail->next = new ListNode(sum%10);
            tail = tail->next;
            sum /= 10;
        }
        if(sum){
            tail->next = new ListNode(sum);
        }
        return head.next;
    }
};

