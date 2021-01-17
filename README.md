# 图书管理与借阅系统

## 概述

一款简洁的图书管理与借阅系统，分为管理员和借阅者模式。

管理员模式具有对图书信息和学生信息的增删改查、对图书信息的导入和导出、增加管理员和修改管理员密码功能。

借阅者模式具有借书和还书的功能。

**演示地址：**

https://dbtest.wangfuchao.com/

测试管理员账户:admin

测试管理员密码:admin

**预览：**

![](https://cdn.jsdelivr.net/gh/sduwfc/pic/20210117215903.png)

## 技术栈

 Servlet + Jsp + Tomcat + MySQL

## 表结构

| 表名    | 中文含义 | 介绍                                             |
| ------- | -------- | ------------------------------------------------ |
| book    | 图书表   | 存放图书信息，如书名、作者、出版社、出版日期等。 |
| borrow  | 借书表   | 存放借书信息，如借阅者id、借阅书名、借阅日期等。 |
| manager | 管理员表 | 存放管理员信息等                                 |
| student | 学生表   | 存放学生信息，如学生id、学生姓名、学生性别等。   |

Book表：

| bookname | author | press | pubdate | type | bookshelf | count |
| -------- | ------ | ----- | ------- | ---- | --------- | ----- |
|          |        |       |         |      |           |       |

Borrow表：

| id   | bookname | type | date | days | count |
| ---- | -------- | ---- | ---- | ---- | ----- |
|      |          |      |      |      |       |

Manager表：

| username | password | islogin | code | state |
| -------- | -------- | ------- | ---- | ----- |
|          |          |         |      |       |

Student表：

| id   | name | gender | phone | email | department | islogin |
| ---- | ---- | ------ | ----- | ----- | ---------- | ------- |
|      |      |        |       |       |            |         |

## ERD

![](https://cdn.jsdelivr.net/gh/sduwfc/pic/20210117220208.png)

## 系统功能截图

登陆界面：

![](https://cdn.jsdelivr.net/gh/sduwfc/pic/20210117220259.png)

管理员界面首页：

![](https://cdn.jsdelivr.net/gh/sduwfc/pic/20210117220317.png)

学生信息管理界面：

可查看学生信息和图书借阅情况，并且可以单个导入或者使用excel表格批量导入学生。

![](https://cdn.jsdelivr.net/gh/sduwfc/pic/20210117220341.png)

图书信息管理界面：

![](https://cdn.jsdelivr.net/gh/sduwfc/pic/20210117220354.png)

添加图书功能：

![](https://cdn.jsdelivr.net/gh/sduwfc/pic/20210117220408.png)

修改管理员密码：

![](https://cdn.jsdelivr.net/gh/sduwfc/pic/20210117220510.png)

添加管理员：

![](https://cdn.jsdelivr.net/gh/sduwfc/pic/20210117220527.png)

用户退出：

![](https://cdn.jsdelivr.net/gh/sduwfc/pic/20210117220538.png)

借阅者登录界面：

![](https://cdn.jsdelivr.net/gh/sduwfc/pic/20210117220626.png)

借阅信息：

可在此界面还书

![](https://cdn.jsdelivr.net/gh/sduwfc/pic/20210117220646.png)

借书功能：

![](https://cdn.jsdelivr.net/gh/sduwfc/pic/20210117220658.png)
