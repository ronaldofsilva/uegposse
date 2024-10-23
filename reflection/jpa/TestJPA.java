package br.ueg.posse.si.p4.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.ueg.posse.si.p4.entity.Person;
import br.ueg.posse.si.p4.factory.EntityFactory;

public class TestJPA {

	public static void main(String[] args) {
		// Obtém uma sessão Hibernate
		Session session = EntityFactory.getSessionFactory().openSession();

		// Inicia a transação
		Transaction transaction = session.beginTransaction();

		// Criando um objeto Person e salvando
		Person person = new Person();
		person.setName("Jane Doe");
		person.setAge(25);

		session.persist(person); // método persist usado no lugar de save no Hibernate 6.x

		// Commit da transação
		transaction.commit();

		// Fechando a sessão
		session.close();

		// Lendo dados
		session = EntityFactory.getSessionFactory().openSession();
		Person fetchedPerson = session.find(Person.class, person.getId());

		System.out.println("Nome: " + fetchedPerson.getName() + ", Idade: " + fetchedPerson.getAge());

		// Fechar a SessionFactory
		EntityFactory.shutdown();
		    }

	

}
