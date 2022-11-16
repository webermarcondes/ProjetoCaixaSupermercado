package Enums;

public enum TipoPessoa {

    PESSOA_FISICA, PESSOA_JURIDICA;

    public static TipoPessoa getTipobyId(int id) {
        if(id == 0) {
            return PESSOA_FISICA;
        }

        else {
            return PESSOA_JURIDICA;
        }
    }
}
