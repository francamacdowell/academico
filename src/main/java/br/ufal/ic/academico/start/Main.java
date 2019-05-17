package br.ufal.ic.academico.start;


import br.ufal.ic.academico.model.Department;
import br.ufal.ic.academico.ui.Ui;
import org.hibernate.Session;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        Ui ui = new Ui();
        ui.printMenu();

        Department d = new Department("IC");



        protected void setUp() throws Exception {

            // A SessionFactory is set up once for an application!
            final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure() // configures settings from hibernate.cfg.xml
                    .build();
            try {
                SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
            }
            catch (Exception e) {
                // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
                // so destroy it manually.
                e.printStackTrace();
                StandardServiceRegistryBuilder.destroy( registry );
            }
        }

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(d);
        session.save(d);
        session.getTransaction().commit();
        session.close();

        // hibernate.cfgsalvar no banco
    }
}
