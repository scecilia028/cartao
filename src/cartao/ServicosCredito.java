package cartao;

public interface ServicosCredito {
    
    boolean registrarCompra(String numeroCartao, double valorCompra);
    
    double verificarSaldo(String numeroCartao);

}