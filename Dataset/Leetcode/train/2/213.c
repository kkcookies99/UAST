/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2) {
    
    //两个链表的指针
    struct ListNode *p1 = l1;
    struct ListNode *p2 = l2;
    //进位标志
    int advance = 0;
    //结果链表的头
    struct ListNode *result_current = NULL;// = (ListNode *)malloc(sizeof(ListNode));
    struct ListNode *result = NULL;
    
    //两个链表全部都为空的时候才退出循环返回
    while(p1 != NULL || p2 != NULL || advance != 0)
    {
        //初始化结果头的节点
        struct ListNode *result_node = (struct ListNode *)malloc(sizeof(struct ListNode));
        memset(result_node,0,sizeof(struct ListNode));
        
        int x = (p1 != NULL) ? p1->val : 0;
        int y = (p2 != NULL) ? p2->val : 0;
        
        //赋值相加
        result_node->val = (x+y+advance)%10;
        advance = (x+y+advance)/10;
        
        if(result == NULL)  //第一次
        {
            result = result_node;
        }
        else        //其余
        {
            //将上一个节点的下一个链接到现在这个
            result_current->next = result_node;     
        }
        //更新链接到现在的链表
        result_current = result_node;         
        
        if(p1 != NULL)
            p1 = p1->next;
        if(p2 != NULL)
            p2 = p2->next;
    }
    
    return result;
}

