package cartao;

public class EmpresaCartaoCredito implements ServicosCredito {
    
    private Armario armario = new Armario();

    @Override
    public boolean registrarCompra(String numeroCartao, double valorCompra) {
        FichaCartao ficha = armario.getFicha(numeroCartao);
        
        if (ficha == null) {
            return false;
        }
        
        if (ficha.getSaldo() < valorCompra) {
            return false;
        }
        
        return true;
    }

    @Override
    public double verificarSaldo(String numeroCartao) {
        // TODO Auto-generated method stub
        return 0;
    }
}