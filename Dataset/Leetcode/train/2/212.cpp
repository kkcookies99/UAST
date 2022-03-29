/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* XXX(ListNode* l1, ListNode* l2) {
        int c = 0;
        ListNode* head = new ListNode(0);
        ListNode* cur = head;
        ListNode* p1 = l1;
        ListNode* p2 = l2;
        while(p1!=nullptr||p2!=nullptr){
            if(p1!=nullptr){
                c+=p1->val;
                p1 = p1->next;
            }
            if(p2!=nullptr){
                c+=p2->val;
                p2 = p2->next;
            }
            ListNode* t = new ListNode(c%10);
            cur->next = t;
            cur = cur->next;
            c = c/10;
        }
        if(c!=0){
            ListNode* t = new ListNode(c%10);
            cur->next = t;
            cur = cur->next;
        }
        return head->next;
    }
};

