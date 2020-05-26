package cartao;

import java.util.ArrayList;
import java.util.List;

public class Armario {

    private static List<FichaCartao> gaveteiro = new ArrayList<FichaCartao>();
    
    static {
        FichaCartao ficha = new FichaCartao("123", TipoCartao.GOLD);
        gaveteiro.add(ficha);
        
        ficha = new FichaCartao("456", TipoCartao.VIP);
        gaveteiro.add(ficha);
        
        ficha = new FichaCartao("789", TipoCartao.PLATINUM);
        gaveteiro.add(ficha);
    }

    public FichaCartao getFicha(String numeroCartao) {
        for (FichaCartao ficha : gaveteiro) {
            if (ficha.getNumeroCartao() == numeroCartao) {
                return ficha;
            }
        }
        return null;
    }
}