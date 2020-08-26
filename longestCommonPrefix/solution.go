
func longestCommonPrefix(strs []string) string {
  if len(strs) == 0 {
    return ""
	}
	// 寻找最小长度的string
  minLen := 10000
  for i := 0; i < len(strs); i++ {
    if len(strs[i]) < minLen {
      minLen = len(strs[i])
    }
  }
  totalLen := len(strs)
  preIdx := 0
  for i:= 0; i < minLen; i++ {
    for j := 0; j < totalLen - 1; j++ {
      if strs[j][i] != strs[j+1][i] {
        preIdx = i - 1
        if preIdx < 0 {
          return ""
        } else {
          return strs[j][:preIdx+1]
        }
      }
    }
	}
	// 假如都一样
  return strs[0][:minLen]
}