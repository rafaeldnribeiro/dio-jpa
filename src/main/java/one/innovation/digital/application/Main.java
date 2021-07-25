package one.innovation.digital.application;

import one.innovation.digital.model.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        /**Configurar fabrica de conexão que vem do arquivo persistence <persistence-unit name="dio-jpa">**/
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dio-jpa");

        /**Gerencia o clico de vida das entidades**/
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Pessoa pessoa = new Pessoa("Rafael Ribeiro", "rafael@rafael.com");
        Pessoa pessoa1 = new Pessoa("Quezia Araujo", "quezia@quezia.com");
        Pessoa pessoa2 = new Pessoa("Moises Araujo", "moises@moises.com");

        /**Obrigatorio quando utiliza-se metodos que alteram o DB**/
        entityManager.getTransaction().begin();

        /**Persistindo alteração no DB**/
        entityManager.persist(pessoa);
        entityManager.persist(pessoa1);
        entityManager.persist(pessoa2);


        /**Finaliza a transação perisistindos todos os dados que foram modificados desde o inicio da transação**/
        entityManager.getTransaction().commit();

        System.out.println("DADOS PERSISTIDOS COM SUCESSO!");

        /**Resgatar instancia no DB**/
        Pessoa pessoaFind = entityManager.find(Pessoa.class, 1);
        System.out.println(pessoaFind);

        /**Alterar uma entidade**/
        entityManager.getTransaction().begin();

        pessoaFind.setNome("Rafael Nascimento");
        pessoaFind.setEmail("rafael@nascimento.com");
        entityManager.getTransaction().commit();

        /**Remover uma entidade**/
        entityManager.getTransaction().begin();
        entityManager.remove(pessoaFind);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();
        entityManager.close();
    }
}











/**
 * ADVERTENCIA: javax.persistence.spi::No valid providers found.
 **/