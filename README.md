# java-
java课程作业项目仓库
java实验四
#阅读程序

## 实验目的
掌握Java中抽象类和抽象方法的定义； 
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
了解异常的使用方法，并在程序中根据输入情况做异常处理

## 实验过程
1.设计学生管理接口和教师管理接口并在接口中设计抽象方法缴纳学费、查学费和发放薪水和查询薪水。
2.设计博士研究生类，实现上述两个接口。
3.对博士研究生类进行实例化，输出税前和税后工资。

## 核心方法
方法一：在博士研究生类中使用implements语法实现接口studentman和teacherman；
方法二：在定义税率时由于国家最新税率属于某一时期的特定固定值，所以采用static final double shuilv = 0.03来赋值，以免浪费内存。
方法三：计算税前年薪应使用月薪乘12减每学期学费乘2；

## 实验结果

税前及税后工资

![image](https://github.com/weishan-990613/java-/blob/main/2.PNG)

查询薪水

![image](https://github.com/weishan-990613/java-/blob/main/4.PNG)

查询学费

![image](https://github.com/weishan-990613/java-/blob/main/3.PNG)

## 实验心得
通过本次实验，我对接口的设计与实现有了更深的了解，对java的基础语法的使用也更加熟悉，对于异常处理和scaner还不太会使用，希望在以后的实验中多加使用，熟悉各种语法。
