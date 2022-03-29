 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        ListNode* list_head = new ListNode(0);
        ListNode* list_node = list_head;
        
        while(1) {
            int sum = list_node->val;

            if (l1) {
                sum += l1->val;
                l1 = l1->next;
            }
            if (l2) {
                sum += l2->val;
                l2 = l2->next;
            }
            
            list_node->val = sum % 10;
            if (l1 || l2 || sum > 9) {
                list_node->next = new ListNode(sum / 10);
                list_node = list_node->next;
            } else {
                break;
            }
        }

        return list_head;
    }
};

