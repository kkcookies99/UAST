 var XXX = function(head, n) {
    var fast=head;
    var slow=head;
for(var i=0;i<n;i++)
{
    fast=fast.next;
}
if(fast==null)
{
    return slow.next;
}
while(fast.next)
{
    slow=slow.next;
    fast=fast.next;
}
slow.next=slow.next.next;
return head;
};

