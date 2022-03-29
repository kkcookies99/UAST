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
        int plus = 0;
        ListNode* t = new ListNode;
        t->next = new ListNode;
        ListNode* temp = t;
        t = t->next;
        while(l1 != nullptr && l2 != nullptr){
            t->val = l1->val + l2->val + plus;
            plus = t->val  >= 10 ? 1 : 0;
            t->val = t->val - plus*10;
            l1 = l1->next;
            l2 = l2->next;
            t->next = new ListNode;
            t = t->next;
        }
        while(l1 != nullptr){
            t->val = l1->val + plus;
            plus = t->val  >= 10 ? 1 : 0;
            t->val = t->val - plus*10;
            l1 = l1->next;
            t->next = new ListNode;
            t = t->next;
        }
        while(l2 != nullptr){
            t->val = l2->val + plus;
            plus = t->val  >= 10 ? 1 : 0;
            t->val = t->val - plus*10;
            l2 = l2->next;
            t->next = new ListNode;
            t = t->next;
        }
        if(plus != 0){
            t->val =  + plus;
            plus = t->val  >= 10 ? 1 : 0;
            t->val = t->val - plus*10;
            t->next = new ListNode;
            t = t->next;
        }
        t = temp->next;
        temp = temp->next;
        // 去掉最后一个多余的node  因为上述步骤中每一步的结尾都新创建了一个节点。
        while(temp->next != nullptr){
            if(temp->next->next == nullptr && temp->next->val == 0){
                temp->next = nullptr;
                break;
            }
            temp = temp->next;
        }
        return t;
    }
};

