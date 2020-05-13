这个module将会把事务交由spring 容器管理

这里使用声明式事务来操作（用AOP将事务织入代码）


注意：
1、delete的sql语句是错误的
2、在domain的selectStudentById方法里加入了一条insert和delete语句

没有事务管理：insert正常插入一条记录，但是delete报错
结果：插入成功

AOP织入事务管理后：insert正常插入一条记录，然后delete报错，但事务回滚了
结果：数据库没有插入这个错误的事务SQL