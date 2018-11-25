这是一个使用spring validation验证框架 对请求参数做验证，并对通过全局异常处理类（GlobalExceptionHandler）捕捉自定义异常处理类并抛出JSON格式的错误提醒信息
需要的Maven dependencies：
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>net.sf.json-lib</groupId>
            <artifactId>json-lib</artifactId>
            <version>2.4</version>
            <classifier>jdk15</classifier>
        </dependency>
代码阅读顺序：
    项目中搜索关键字Step，可以看到Step1 ~ N ,是代码实现的顺序
知识点补充：     
    JSR303/JSR-349: JSR303是一项标准,只提供规范不提供实现，规定一些校验规范即校验注解，如@Null，@NotNull，@Pattern，位于javax.validation.constraints包下。JSR-349是其的升级版本，添加了一些新特性。
    1.hibernate validation：hibernate validation是对这个规范的实现，并增加了一些其他校验注解，如@Email，@Length，@Range等等
    2.spring validation：spring validation对hibernate validation进行了二次封装，在springmvc模块中添加了自动校验，并将校验信息封装进了特定的类中
