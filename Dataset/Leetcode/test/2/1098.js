 var XXX = function(l1, l2) {
  var l3 = [], total = 0;
  var count1 = l1.reduceRight((preValue, curValue, index) => 
    preValue + curValue*Math.pow(10,l1.length-1-index)
  );
  var count2 = l2.reduceRight((preValue, curValue, index) => 
    preValue + curValue*Math.pow(10,l2.length-1-index)
  );
  total = (count1+count2).toString();
  if(total > 0){
    for(var i=total.length - 1;i>-1;i--){
        l3.push(Number(total[i]));
    }
  }
  return l3;
}

