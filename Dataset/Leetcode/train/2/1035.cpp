 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
      ListNode dummy(0);
      ListNode* tail = &dummy;
      int carry = 0,sum = 0;
      while(l1 || l2 || carry)
      {
          sum = (l1 ? l1->val : 0) + (l2 ? l2->val : 0) + carry;
          tail->next = new ListNode(sum%10);
          tail = tail->next;
          carry = sum/10;
          l1 = l1 ? l1->next : nullptr;
          l2 = l2 ? l2->next : nullptr;
      }
        return dummy.next;
    }

