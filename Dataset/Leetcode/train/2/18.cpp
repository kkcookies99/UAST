/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        auto head = l1, n = l1;
        auto carryNode = l2;
        int carry = 0;
        while (l1 != nullptr || l2 != nullptr)
        {
            int num = 0;
            if (l1 != nullptr) { num += l1->val; l1 = l1->next; }
            if (l2 != nullptr) { num += l2->val; l2 = l2->next; }
            num += carry;
            n->val = num % 10;
            carry = num / 10;
            if (l1 == nullptr && l2 == nullptr && carry > 0)
            {
                n->next = carryNode; 
                carryNode->val = 1; 
                carryNode->next = nullptr; 
            } else if (l1 == nullptr && l2 != nullptr)
            {
                n->next = l2;
            }
            n = n->next;
        }
        return head;
    }
};

