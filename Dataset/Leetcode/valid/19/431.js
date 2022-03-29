 var XXX = function(head, n) {
var arr=new Array();
var node=head;
while(node)
{
    arr.push(node);
    node=node.next;
}
if(arr.length==n)
return head.next;
node=arr[arr.length-n-1];
node.next=node.next.next;
return head;
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


