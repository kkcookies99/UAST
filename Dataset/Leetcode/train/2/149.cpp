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
        ListNode *p = new ListNode(0);
        ListNode *tmp = p;
        int temp = 0;
        while (l1 || l2 || temp > 0)
        {
            int t = (l1 ? l1->val : 0) + (l2 ? l2->val : 0) + temp;
            temp = 0;
            if (t >= 10)
            {
                temp = 1;
                t -= 10;
            }
            p->next = new ListNode(t);

            l1 = l1 ? l1->next : nullptr;
            l2 = l2 ? l2->next : nullptr;
            p = p->next;
        }
        return tmp->next;
    }
};

