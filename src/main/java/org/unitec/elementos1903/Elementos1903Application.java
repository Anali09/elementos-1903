package org.unitec.elementos1903;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Elementos1903Application implements CommandLineRunner {
    
    @Autowired
    RepoCliente repoCliente;

	public static void main(String[] args) {
		SpringApplication.run(Elementos1903Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
      
       //repoCliente.save(new Cliente(1, "Lilia Cruz","ana.cruzs@hotmail.com"));
       //repoCliente.save(new Cliente(2,"Cesar Rosales", "cesa.Olguin@hotmail.com"));
       
       //Buscar todo
       
      // for(Cliente c: repoCliente.findAll()){
       //    System.out.println(c);
      //}
       
       //Buscar por id
       System.out.print(repoCliente.findById(2));
       
       //Borramos el primero despues lo vuelven a insetar 
       
      // repoCliente.deleteById(1);
}
}