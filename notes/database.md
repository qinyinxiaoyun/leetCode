#Database System 1
##数据库定义
数据库管理系统提供数据库语言DDL,DCL,DML给用户  
关系模式（表名 表标题 表内容）  
表/关系
列名/字段/属性
行/元组/元素  
**数据库结构**  
外模式/子模式  
概念模式/全局模式  
内模式/存储模式  
**关系模型**  
基本结构  
基本操作  
完整性约束（实体，参照，自定义）  
候选码->主码 主属性 外码  
**关系代数**  
并 差 积 选择 投影 连接  
##SQL语言
数据库完整性：完整性规则，静态约束（列约束，表约束），动态约束（触发器）  
完整性约束规则OPAR  
数据库安全性：强制安全性，自主安全性（存储矩阵，视图） 授权 安全性规则：SOTP  
**嵌入式SQL语言**  
交互式SQL 非过程性 难做复杂查询  
嵌入式SQL：exec sql into ":程序变量"  
**动态SQL**  
立即执行：exec sql execute immediate :host  
编译动态参数：exec sql prepare sql_temp from :host   exec sql execute sql_temp using :con  
数据字典/目录 存储数据库各类对象定义信息的表  
ODBC/JDBC java.sql driver driverManagement Connection  
