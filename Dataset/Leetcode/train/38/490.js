  var XXX = function(n) {
    let i=1
    let pre = '1'.split('')
    let count = 1
    let cur  =[]
    while( i<n){
      for(let i = 0;i<pre.length;i++){
        //对上一个数字进行分析，相同数字累加到count
        if(pre[i]==pre[i+1])
          count++
        //遇到不同的数字后
        else{
          //新的数字为cur
          cur.push(String(count))
          cur.push(pre[i])
          count=1
        }
      }     
      //为下一次迭代重新赋值
      pre.length=0
      let temp= pre
      pre = cur
      cur=temp
      i++

    }
    return pre.join('')
  };

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


