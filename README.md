## 文件目录
java文件包名前缀建议为：com.[yourname].[project_name]

## 数据库相关
- 修改resources/config/jdbc.properties下的jdbc.driver、jdbc.url、jdbc.username、jdbc.password
- resources/mapper下的xxxMapper.xml为Mybatis的Mapper文件

## Spring相关
- 修改resources/spring/spring-dao.xml
  - itypeAliasesPackage属性值为pojo层的包名
  - basePackage属性值为dao层的包名
- 修改resources/spring/spring-service.xml
  - 修改context:component-scan base-package属性值为service层的包名
- 修改resources/spring/spring-web.xml
  - 修改context:component-scan base-package属性值为controller层的包名
