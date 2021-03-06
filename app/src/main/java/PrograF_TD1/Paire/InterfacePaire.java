package PrograF_TD1.Paire;

public interface InterfacePaire<F,S> {
    F fst();
    S snd();

    F changeFst();

    <C> InterfacePaire<C,S> changeFst(C value);
    <C> InterfacePaire<F,C> changeSnd(C value);
}
