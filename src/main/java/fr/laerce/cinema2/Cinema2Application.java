package fr.laerce.cinema2;

import fr.laerce.cinema2.dao.PersonsDao;
import fr.laerce.cinema2.model.Personne;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
public class Cinema2Application {
    public static void main(String[] args) {
        SpringApplication.run(Cinema2Application.class, args);
    }

    /*@Bean

    public CommandLineRunner runner(PersonsDao dao){
        return new CommandLineRunner() {
            @Override
            @Transactional
            public void run(String... args) throws Exception {
                List<Personne> persons = dao.getAll();
                for (Personne p: persons
                ) {
                    System.out.println(p.getNom());
                }
                Personne person = new Personne();
                person.setNom("Ventura");
                person.setPrenom("Lino");
                dao.save(person);
                System.out.println("id associé à : "+person.getNom()+" : "+person.getId());
            }
        };
    }*/

}
