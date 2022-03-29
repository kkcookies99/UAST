 struct ListNode* XXX(struct ListNode* l1, struct ListNode* l2)
{
    struct ListNode *p_head=NULL, *p_tail=NULL,*head=NULL;
	int cnt=0,carry=0,add=0;
	while((l1 != NULL)||(l2 != NULL)){
		p_tail=(struct ListNode*)malloc(sizeof(struct ListNode));
		if((l1 != NULL)&&(l2 != NULL)){
			add = l1->val + l2->val + carry;
			l1=l1->next;
			l2=l2->next;
		}
		else if(l1 == NULL){					
			add = l2->val + carry;
			l2=l2->next;
		}
		else if(l2 == NULL){
			add = l1->val + carry;
			l1=l1->next;			
		}
		p_tail->val=add%10;
		carry=add/10;
		if((cnt++)==0){
			p_head=head=p_tail;
		}
		else{
			p_head->next=p_tail;
			p_head=p_tail;
		}
	}
	if(carry!=0){
		p_tail=(struct ListNode*)malloc(sizeof(struct ListNode));
		p_tail->val = carry;
		p_head->next=p_tail;
		p_head=p_tail;
	}	
	p_head->next=NULL;
	return head;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


