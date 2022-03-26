#搭建SSM项目的步骤
1. 新建Maven工程
2. 修改目录,修改pom.xml文件
3. 添加SSM框架的所有依赖
4. 拷贝jdbc.porperties到resources目录下
5. 新建applicationContext_dao.xml文件,进行数据访问层的配置
6. 新建applicationContext_service.xml文件,进行业务逻辑层的配置
7. 新建**springmvc.xml**文件,配置springmvc的框架
8. 新建SqlMapConfig.xml文件,进行分页插件的配置
9. 使用逆向工程生成pojo和mapper的文件






10. 开发业务逻辑层,实现登录判断
11. 开发控制器AdminAction,完成登录处理
12. 改造页面,发送登录请求,验证登录


#集中定义依赖版本号
1. **<mybatis.spring.version>1.3.1</mybatis.spring.version>** mybatis分页插件
2. **<slf4j.version>1.6.4</slf4j.version>** 日志插件
3. **<druid.version>1.1.12</druid.version>** druid数据库连接池——阿里巴巴
4. **<pagehelper.version>5.1.2</pagehelper.version>** 分页插件
5. **<jstl.version>1.2</jstl.version>**

