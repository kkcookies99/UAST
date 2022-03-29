 var XXX = function(nums) {
    let res=new Array()
    dfs([],nums)
    return res
 function dfs(shouna,weishouna)
  {
      if(weishouna.length==0)
      {
         return res.push(shouna)
      }
      for(let i=0;i<weishouna.length;i++)
      {
          let c=JSON.parse(JSON.stringify(shouna))
          let d=JSON.parse(JSON.stringify(weishouna))
          c.push(weishouna[i])
          d.splice(i,1)
          dfs(c,d)
      }
  }
};```

