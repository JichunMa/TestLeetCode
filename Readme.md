# personal LeetCode result set
- [x] **2018/09/02 第一周**
  - [x] 1 Two Sum
  - [x] 2 Add Two Numbers
  - [x] 7 Reverse Integer
  - [x] 9 Palindrome Number
  - [x] 125 Valid Palindrome



### 踩坑记录
**Integer.MIN_VALUE 取绝对值不能直接使用Math.abs() 应该转为long在进行处理**
### 优秀代码记录
#### 提取字符串中的英文数字
```
 String stringRemoveSymbol = s.replaceAll("[^a-z^A-Z^0-9]", "");
```
#### replaceAll 正则符号替换
```
  String digitalStringNoPlus = digitalString.replaceAll("[+]", "");
```
### 没有做出来的题
204 Count Primes
 
解法: 埃拉托斯特尼筛法 <https://zh.wikipedia.org/wiki/%E5%9F%83%E6%8B%89%E6%89%98%E6%96%AF%E7%89%B9%E5%B0%BC%E7%AD%9B%E6%B3%95>         


