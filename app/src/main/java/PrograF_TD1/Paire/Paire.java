package PrograF_TD1.Paire;

public class Paire<F,S> implements InterfacePaire<F,S> {

    private F _fst;
    private S _snd;


    public F _fst(){

        return _fst();

    }

    @Override
    public S _snd(){

        return _snd();

    }

    @Override
    public F fst() {
        return null;
    }

    @Override
    public S snd() {
        return null;
    }

    @Override
    public F changeFst(){

        return fst();
    }
    @Override
    public String toString() { return String.format("(%s, %s) :: Paire[%s,%s]", _fst, _snd, _fst.getClass().getSimpleName(), _snd.getClass().getSimpleName()); }


    @Override
    public <C> InterfacePaire<C,S> changeFst(C val) { return new Paire<>(val, _snd); }

    @Override
    public <C> InterfacePaire<F,C> changeSnd(C val) { return new Paire<>(_fst, val); }

}

