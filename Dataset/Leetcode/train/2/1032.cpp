 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        int carry=0;
        ListNode *ansList = new ListNode();
        ListNode *head = ansList;
        while(l1 || l2 || carry){
            int sum = carry;
            if(l1) sum += l1->val, l1 = l1->next;
            if(l2) sum += l2->val, l2 = l2->next;
            carry = sum/10;
            sum %= 10;
            ansList->next = new ListNode(sum);
            ansList = ansList -> next;
        }
        return head->next;
    }
};

