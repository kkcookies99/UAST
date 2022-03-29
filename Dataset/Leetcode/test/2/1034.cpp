 class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        int index = 0;
        ListNode* first = l1;
        ListNode* second = l2;
        ListNode* result = new ListNode(0);
        ListNode* node = result;
        while (first != nullptr && second != nullptr) {
            int sum = first->val + second->val + index;
            if (sum > 9) {
                sum = sum % 10;
                index = 1;
            } else {
                index = 0;
            }
            ListNode* newNode = new ListNode(sum);
            node->next = newNode;
            node = node->next;
            first = first->next;
            second = second->next;
        }
        if (first == nullptr) {
            ListNode* tmp = second;
            while (second != nullptr && index == 1) {
                int sum = second->val + index;
                if (sum > 9) {
                    index = 1;
                    second->val = sum % 10;
                    second = second->next;
                } else {
                    index = 0;
                    second->val = sum;
                    break;
                }
            }
            node->next = tmp;
        } else if (second == nullptr){
            ListNode* tmp = first;
            while (first != nullptr && index == 1) {
                int sum = first->val + index;
                if (sum > 9) {
                    index = 1;
                    first->val = sum % 10;
                    first = first->next;
                } else {
                    first->val = sum;
                    index = 0;
                    break;
                }
            }
            node->next = tmp;
        }
        
        if (index == 1) {
            ListNode* tmp = new ListNode(1);
            while (node->next != nullptr) {
                node = node->next;
            }
            node->next = tmp;
        }
        
        return result->next;
    }
};

