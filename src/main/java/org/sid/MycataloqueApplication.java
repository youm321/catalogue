package org.sid;
import org.sid.dao.*;
import org.sid.entities.produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycataloqueApplication implements CommandLineRunner   {
	private produitRepository produitRepository;
@Autowired


	public void run(String ... args) throws Exception{
	
	produitRepository.save(new produit(null, "ordi hp ",4566,1));
    produitRepository.save(new produit(null, "iprimante hp ",4566,3));
    produitRepository.save(new produit(null, "smart  ",4566,1));

    produitRepository.findAll().forEach(p->){
        System.out.println(p.toString);

    });
	}

}

