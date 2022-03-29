 var XXX = function(s) {
    const map = {
        '[': ']',
        '{': '}',
        '(': ')'
    }
    let a = []
    for (let i = 0; i < s.length; i++) {
        if (['[', '{', '('].includes(s[i])) {
            a.push(s[i])
        } else {
          const top = a.pop();
          if (s[i] !== map[top]) {
            return false;
          }
        }
    }
    if (a.length > 0) {
        return false
    }
    return true;
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

