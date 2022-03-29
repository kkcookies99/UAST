/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

//傻逼吗，用链表来存数字？
struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2){
    int num, temp = 0;

    struct ListNode * outputNode = (struct ListNode *)malloc(sizeof(struct ListNode));
    outputNode -> next = NULL;
    struct ListNode * tail = outputNode;
    
    while(l1 || l2){
        num = 0;
        if(l1 != NULL){
            num += l1->val;
            l1 = l1->next;
        }
        
        if(l2 != NULL){
            num += l2->val;
            l2 = l2->next;
        }
        
        num += temp;
        temp = 0;
        
        if(num >= 10){
            num %= 10;
            temp = 1;
        }
        
        tail -> val = num;
        
        if(l1 || l2){
            struct ListNode* newNode = (struct ListNode*)malloc(sizeof(struct ListNode));
            newNode -> next = NULL;
            tail -> next = newNode;
            tail = tail -> next;
        }
    }
    
    if(temp){
        struct ListNode* newNode = (struct ListNode*)malloc(sizeof(struct ListNode));
        newNode -> next = NULL;
        tail -> next = newNode;
        tail = tail -> next;
        tail -> val = temp;
    }
    
    return outputNode;
}

