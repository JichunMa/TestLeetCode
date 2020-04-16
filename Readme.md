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
   - [x] 067 二进制求和
- [x] **2020/4/4**
   - [x] 049 字母异位词分组
   - [x] 990 验证外星语词典
- [x] **2020/4/5**
   - [x] 560 和为K的子数组(与 001 两数之和解法类似)
   - [x] 098 验证二叉搜索树
- [x] **2020/4/6**
   - [x] 226 翻转二叉树
   - [x] 199 二叉树的右视图
   - [x] 124 二叉树中的最大路径和
   - [x] 572 另一个树的子树
- [x] **2020/4/7**
   - [x] 236 二叉树的最近公共祖先
   - [x] 543 二叉树的直径
- [x] **2020/4/8**
   - [x] 114 二叉树展开为链表
- [x] **2020/4/10**
   - [x] 20 有效的括号
- [x] **2020/4/11**
   - [x] 692 前K个高频单词
   - [x] 102 二叉树的层序遍历
   - [x] 146 LRU缓存机制
- [x] **2020/4/13**
   - [x] 121 买卖股票的最佳时机
   - [x] 88 合并两个有序数组
- [x] **2020/4/136**
   - [x] 739 每日温度
   - [x] 230 二叉搜索树中第K小的元素
   - [x] 250 统计同值子树

>>>>>>> 和为K的子数组
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



    


