 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        int carry = 0;
        ListNode* ans = new ListNode(0);
        ListNode* ls = ans;
        while(l1 && l2){
            int num = (l1->val + l2->val + carry) % 10;
            carry = (l1 -> val + l2->val + carry) / 10;
            ls->next = new ListNode(num);
            ls = ls->next;
            l1 = l1->next;
            l2 = l2->next;
        }

        while(l2){
            int num = (l2->val + carry) % 10;
            carry = (l2->val + carry) / 10;
            ls->next = new ListNode(num);
            ls = ls->next;
            l2 = l2->next;
        }

        while(l1){
            int num = (l1->val + carry) % 10;
            carry = (l1 ->val + carry) / 10;
            ls->next = new ListNode(num);
            ls = ls->next;
            l1 = l1->next;
        }
        if(carry){
            ls->next = new ListNode(1);
            ls = ls->next;
        }
        ls->next = nullptr;
        return ans->next;
    }
};

