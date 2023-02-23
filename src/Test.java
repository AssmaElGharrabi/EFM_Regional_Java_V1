public class Test {

    public static void main(String[] args) throws Exception {
        Magasin magasin1 = new Magasin();
        magasin1.ajouter(new Article(566, 13999.0));
        magasin1.ajouter(new Article(51222, 1000.0));
        magasin1.ajouter(new ArticleEnSolde(45535, 300.0, 20.0));
        magasin1.ajouter(new ArticleEnSolde(44462, 500.0, 50.0));
        System.out.println(magasin1.nombreArticlesEnSolde());
        System.out.println(magasin1.supprimer(45555));
        System.out.println(magasin1.indiceDe(641));
        magasin1.enregistrer("src\\data.txt");
    }
}
