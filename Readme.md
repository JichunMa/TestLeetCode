# personal LeetCode result set
- [x] **2018/09/02 第一周**
  - [x] 1 Two Sum
  - [x] 2 Add Two Numbers
  - [x] 7 Reverse Integer
  - [x] 9 Palindrome Number
  - [x] 125 Valid Palindrome
- [x] **2018/11/12**
  - [x] 104 Maximum Depth Of Binary Tree
  - [x] 98 Validate Binary Search Tree

- [x] **2020/3/27**
  - [x] 680 验证回文字符串 Ⅱ
 
- [x] **2020/3/29**
  - [x] 415 字符串相加
  - [x] 937 重新排列日志文件
- [x] **2020/3/30**
  - [x] 273 整型转化英文表示
- [x] **2020/4/1**
   - [x] 3 无重复字符的最长子串
- [x] **2020/4/2**
   - [x] 202 快乐数
   - [x] 007 整数反转
- [x] **2020/4/3**
   - [x] 008 字符串转换整数 (atoi)

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

**204 Count Primes**
 
解法: 埃拉托斯特尼筛法(维基百科有动图演示)

**206 反转链表(递归实现方式)**
**155 最小栈(使用两个栈，一个栈保存所有元素，另一个栈保存当前状态最小的值，注意等于也入栈!)**
**190 颠倒二进制位**
**98 检查二叉搜索树(中序遍历检查结果是否为一个递增的数组)**



    


