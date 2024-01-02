# 后台管理系统


## 简介:
用于网络安全web测试简单开发的后台开发模板框架，具备菜单管理,用户管理,角色管理,权限管理,日志管理这5个功能。

运用layui后台管理模板，界面简介大方且美观。

采用mvc架构，使代码易于管理和修改，合理的注解，使代码通俗易懂，具有较强的阅读性。

## 编译环境：

> jdk 1.8 
>
> mysql 5.7
>
> tomcat 7

## 框架：

> springboot2.0 
>
> mybatis
>
> spring security
>
> redis

## jar包管理工具：

> Maven

## 编译器：

> IDEA

## 完成进度：

> manager_system_1.0.0版本完成  从tag中 V1.0.0可获取完整版本
>
> manager_system_2.0.0版本打算结合spring security完成  从tag中 V2.0.0可获取完整版本

## 系统功能：

> 控制面板
>
> 用户管理：
>
> > 用户管理
> >
> > 角色管理
> >
> > 权限管理
>
> 系统日志：
>
> > 日志管理

## 启动设置:
* 修改application.yml中的数据链接

* 执行`mysql -uroot -p 数据库 < manager_system.sql`导入数据库脚本。
* 运行`ManagerSystemApplication`，启动后访问:<http://localhost:8080/manager/login> 
* 管理员:
  * 账号：`superadmin`
  * 密码:   `123`


