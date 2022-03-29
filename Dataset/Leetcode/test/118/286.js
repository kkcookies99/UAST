 var XXX = function(numRows) {
    var arr=new Array();
        arr.push([1]);
if(numRows==1)
{
return arr;
}
else
{
    for(var i=0;i<numRows-1;i++)
    {
        var a=new Array(arr[i].length+1).fill(0);
        a[0]=1;
        for(var j=1;j<a.length-1;j++)
        {
            a[j]=arr[i][j];
            a[j]+=arr[i][j-1];

        }
        a[a.length-1]=1;
        arr.push(a);
    }
}
return arr;
};

