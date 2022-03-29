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
        int carry=0;
        int sum=0;
        ListNode newhead(0);
        ListNode* nownode=&newhead;
        while(l1||l2||carry)
        {
            sum=(l1?l1->val:0)+(l2?l2->val:0)+carry;
            carry=sum/10;
            nownode->next=new ListNode(sum%10);
            nownode=nownode->next;

            l1=l1?l1->next:l1;
            l2=l2?l2->next:l2;
        }
        
        return newhead.next;
    }
};

