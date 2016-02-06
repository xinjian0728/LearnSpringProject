XML配置的结构
------
一般配置文件结构如下：<br/>
<beans>
    <import resource=”resource1.xml”/>
    <bean id=”bean1” class=””></bean>
    <bean id=”bean2” class=””></bean>
<bean name=”bean2” class=””></bean>
    <alias alias="bean3" name="bean2"/>
    <import resource=”resource2.xml”/>
</beans>
