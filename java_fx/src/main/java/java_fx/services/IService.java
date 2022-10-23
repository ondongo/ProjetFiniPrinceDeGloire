package java_fx.services;
import java.util.List;

import java_fx.entities.Classe;
import java_fx.entities.Inscription;
import java_fx.entities.UsersAdmin;
import java_fx.entities.Utilisateurs;

public interface IService {
    public Classe insertClasse(Classe classe);



    
    public List<Classe> selectAllClasses();
    public Classe selectClasseByID(int id); 



    public Utilisateurs insertProfesseur(Utilisateurs utilisateurs );
    public List<Utilisateurs> selectAllProfesseur();
    public Utilisateurs  selectProfesseurByID(int id);






    public void affectation(Classe classe,Utilisateurs utilisateurs);
    
    public List<Classe> filterprofclasse(int id);



    public Utilisateurs insertEtudiant(Utilisateurs utilisateurs );
    public List<Utilisateurs > selectAllEtudiant();
    public Utilisateurs  selectEtudiantByID(int id);
    public Utilisateurs  selectEtudiantByNom(String nom);



    public Inscription InsertEtudiant(Inscription inscription);
   
   
    public List<Utilisateurs> filtreAn(String annee);


    // Je suis immortel
    public List<Utilisateurs> filtreAnClasse(String annee,int id);

    public UsersAdmin connexion(String login,String password);



    
    
}

