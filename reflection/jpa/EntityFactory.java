package br.ueg.posse.si.p4.factory;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import br.ueg.posse.si.p4.entity.Person;

public class EntityFactory {

	private static SessionFactory sessionFactory;

    static {
        try {
            // Criando uma instância da configuração do Hibernate
            Configuration configuration = new Configuration();

            // Configurando propriedades do Hibernate para MySQL
            configuration.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
            configuration.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/dbapp");
            configuration.setProperty("hibernate.connection.username", "root");
            configuration.setProperty("hibernate.connection.password", "");
            configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

            // Configurações adicionais
            configuration.setProperty("hibernate.show_sql", "true");
            configuration.setProperty("hibernate.hbm2ddl.auto", "update");

            // Adicionando a classe de entidade
            configuration.addAnnotatedClass(Person.class);

            // Registrando os serviços e construindo a SessionFactory
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}