package PrograF_TD1.Arbresgeneralises;

import java.util.Set;

public interface Arbre<T>{
    int taille();
    boolean contient(final Integer val);

    boolean contient(T val);

    Set<Integer> valeurs();
}
