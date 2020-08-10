package main

import (
  "fmt"
  // "strings"
)

func main () {
  s := "dvdf"
  fmt.Println(s)
}

// func lengthOfLongestSubstring(s string) int {
//   if len(s) <= 1{
//     return len(s)
//   }
//   strIndex := 1
//   strBegin := 0
//   maxLen := 1
//   tmpLen := 1
//   for {
//     if (strIndex >= len(s)) {
//       break
//     }
//     // 判断 strIndex 下的字符串 是不是存在于 [strBegin, strIndex] 之中
//     // 如果是的话 strBegin = strIdx（标识存在于 [strBegin, strIndex] 之中具体的下标） + strIndex tmpLen更新
//     // 如果 strIdx === strIndex - 1 则 strBegin = strIndex
//     // 如果不是的话 strIndex++ 同时 maxLen tmpLen 更新
//     tmpStr := string([]byte(s)[strBegin:strIndex])
//     strIdx := findIdxInStr(tmpStr, string([]byte(s)[strIndex:strIndex+1]))
//     fmt.Println("[tmpStr]", tmpStr)
//     fmt.Println("[strIdx]", strIdx)
//     fmt.Println("[tmpLen]", tmpLen)
//     fmt.Println("[maxLen]", maxLen)
//     fmt.Println("[strIndex]", strIndex)
//     if strIdx >= 0 {
//       if strIdx == len(tmpStr) - 1 {
//         strBegin = strIndex
//         tmpLen = 1
//       } else {
//         tmpLen = strIndex - strBegin - strIdx
//         strBegin = strBegin + strIdx + 1;
//       }
//     } else {
//       tmpLen++
//       if tmpLen > maxLen {
//         maxLen = tmpLen
//       }
//     }
//     strIndex++
//   }
//   return maxLen
// }

// func findIdxInStr (s string, key string) int {
//   idx := -1
//   for i := 0; i < len(s); i++ {
//     tmp := string([]byte(s)[i:i+1])
//     if tmp == key {
//       idx = i
//     }
//   }
//   return idx
// }