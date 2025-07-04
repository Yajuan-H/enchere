package fr.eni.tp.enchere.dal;

import fr.eni.tp.enchere.bo.ArticleVendu;
import fr.eni.tp.enchere.bo.Utilisateur;

import java.util.List;

public interface ArticleVenduDAO {
    void create(ArticleVendu articleVendu);
    ArticleVendu readById(int id);
    List<ArticleVendu> findAll();
    List<ArticleVendu> findAllByRecherche(String recherche);
    List<ArticleVendu> findAllByCategorieAndRecherche(Integer idCategorie, String recherche);
    List<ArticleVendu> findAllByCategorie(Integer categorieId);
    void update(ArticleVendu articleVendu);
    void delete(int id);
}
