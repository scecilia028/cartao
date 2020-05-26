package cartao;

public enum TipoCartao {
    GOLD(1000), VIP(3000), PLATINUM(5000);
    
    private double limiteCredito;
    
    private TipoCartao(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }
}