package main

import (
  "fmt"
  // "strings"
)

func main () {
  var str = []string{"flower", "flow", "fla"}

  fmt.Println(longestCommonPrefix(str))

  // for i:= 0; i < 2; i++ {
  //   for j := 0; j < 3 - 1; j++ {
  //     if i == 0 {
  //       break
  //     }
  //     fmt.Println("hello")
  //   }
  // }
}

func longestCommonPrefix(strs []string) string {
  if len(strs) == 0 {
    return ""
  }
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
  return strs[0][:minLen]
}
