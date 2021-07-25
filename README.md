## Entendendo o JPA



#### Passos para utilizar o JPA na sua aplicação:

1.Realizar o download do Java Persistence API(JPA) e do driver JDBC para o BD MySQL.
É possivel baixar manualmente ou através do Gradle ou Maven;

Usando Gradle: 

1.Adicionar o JPA ao build.gradle
https://mvnrepository.com/artifact/javax.persistence/javax.persistence-api

Adiciona o driver JDBC MySQL ao build.gradle 
https://mvnrepository.com/artifact/mysql/mysql-connector-java

2.Criar a pasta META-INF, na pasta resources e dentro da META-INF o arquivo persistence.xml e configurar os seguintes parâmetros:
Configurar a unidade persistência, URL da string de conexão(driver, endereço do BD e nome do BD),usuario do BD, senha do BD,
driver e classes que serão mapeadas para serem usadas pelo JPA.

3.Utilizar as annotations nas classes que serão mapeadas para uso do Hibernate.

4.Configurar o entityManager



#### Passos para utilizar o Hibernate com as especificações JPA:

1.Realizar o download da API de implementação desejada.É possivel baixar manualmente ou através do Gradle ou Maven.

https://mvnrepository.com/artifact/org.hibernate/hibernate-gradle-plugin 

2.Modificar o arquivo **persistence.xml** configurando a tag <provider> indicando a classe da implementação que será usada.



**CRUD** com **Java** utilizando especificações **JPA** com provedor **Hibernate** e protocolo **JDBC** em um banco de dados **MySQL** 



*Projeto para o curso **JPA** da **Digital Innovation One**.*

[Acesso ao curso aqui](https://web.digitalinnovation.one/course/trabalhando-com-banco-de-dados-utilizando-jdbc-e-jpa/learning/36caf662-304d-444b-978d-958d79bb5a9a?back=/track/santander-fullstack-developer)











