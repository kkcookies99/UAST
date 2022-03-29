 var XXX = function(strs) {
  if (!strs.length) return ''
  let commonPrefixStr = ''
  for (let i = 0; i < strs[0].length; i++) {
    let temp = strs[0].charAt(i)
    for (let j = 1; j < strs.length; j++) {
      if (strs[j].charAt(i) != temp) {
        return commonPrefixStr
      }
    }
    commonPrefixStr += temp
  }
  return commonPrefixStr
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


