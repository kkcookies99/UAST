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
        if(l1 == NULL || (l1->val == 0 && l1->next == NULL))
            return l2;
        else if(l2 == NULL || (l2->val ==0 && l2->next == NULL))
            return l1;
        else{
            ListNode* node = new ListNode(l1->val+l2->val);
            ListNode* p =  node;
            ListNode* temp = NULL;
            while(l1->next && l2->next){
                l1 = l1->next;
                l2 = l2->next;
                temp = new ListNode(l1->val+l2->val);
                node->next = temp;
                node = temp;
            }
            while(l1->next){
                l1 = l1->next;
                temp = new ListNode(l1->val);
                node->next = temp;
                node = temp;
            }
            while(l2->next){
                l2 = l2->next;
                temp = new ListNode(l2->val);
                node->next = temp;
                node =temp;
            }
            //进位
            temp = p;
            while(temp->next){
                if((temp->val) >= 10){
                    temp->val = temp->val-10;
                    temp->next->val++;
                }
                temp = temp->next;
            }
            if(temp->val >= 10){
                node = new ListNode(1);
                temp->val -= 10;
                temp->next = node;
            }
            return p;
        }
    }

};

