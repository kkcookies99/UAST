class Solution {
public:
    ListNode* XXX(ListNode* head) {

        if (head == NULL) return head;

        ListNode* left = head;
        ListNode* right = head->next;

        //右指针遍历，左指针等待
        //右指针的值和左指针相等，左指针指向NULL
        //右指针的值和左指针不相等，左指针指向右指针
        while (right != NULL) {
            if (right->val == left->val) {
                left->next = NULL;
            }
            if (right->val != left->val) {
                left->next = right;
                left = left->next;
            }
            right = right->next;
        }

        return head;
    }
};

