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
        ListNode* ladd = new ListNode();
        ListNode* lfirst = ladd;
        ListNode* ltemp = new ListNode(0);
        int plus = 0;
        while(l1 != ltemp || l2 != ltemp)
        {
            if(plus + l1->val + l2->val < 10)
            {
                ladd->val = plus + l1->val + l2->val;
                plus = 0;
            }
            else
            {
                ladd->val = plus + l1->val + l2->val - 10;
                plus = 1;
            }
            l1 = l1->next;
            l2 = l2->next;
            if(!l1){l1 = ltemp;}
            if(!l2){l2 = ltemp;}
            if(l1 != ltemp || l2 != ltemp)
            {
                ladd->next = new ListNode();
                ladd = ladd->next;
            }
        }
        if(plus)
        {
            ladd->next = new ListNode();
            ladd = ladd->next;
            ladd->val = plus;
        }
        return lfirst;
    }
};