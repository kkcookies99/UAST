/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2) {
    
    int c = 0;
    int value = 0;
    struct ListNode *pList1 = l1;
    struct ListNode *pList2 = l2;
    struct ListNode *pListHead = NULL;
    struct ListNode *pNewList = (struct ListNode *)malloc(sizeof(struct ListNode));
    pListHead = pNewList;
    
    for(;pList1 && pList2;pList1=pList1->next,pList2=pList2->next)
    {
        value = pList1->val + pList2->val + c;
        c = value / 10;
        
        pNewList->next = (struct ListNode *)malloc(sizeof(struct ListNode)) ;
        pNewList = pNewList->next;
        pNewList->val = value % 10;
        pNewList->next = NULL;
    }
    
    if(pList1)
    {
        while(pList1)
        {
            value = pList1->val + c;
            pList1 = pList1->next; 
            c=value/10; 
            
            pNewList->next = (struct ListNode *)malloc(sizeof(struct ListNode));
            pNewList = pNewList->next;     
            pNewList->val = value%10;
            pNewList->next = NULL; 
        }
    }
    
    if(pList2)
    {
        while(pList2)
        {
            value = pList2->val + c;
            pList2 = pList2->next;
            c=value/10; 
          
            pNewList->next = (struct ListNode *)malloc(sizeof(struct ListNode));
            pNewList = pNewList->next;                      
            pNewList->val = value%10;
            pNewList->next = NULL; 
        }
    }
    
    if(c)
    {
        pNewList->next = (struct ListNode *)malloc(sizeof(struct ListNode));
        pNewList = pNewList->next;
        pNewList->val = 1;
        pNewList->next = NULL;         
    }
    
    return pListHead->next;
}

