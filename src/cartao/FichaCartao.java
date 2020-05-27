package cartao;

public class FichaCartao {
    
    private String numeroCartao;
    
    private TipoCartao tipoCartao;
    
    private double debitoAtual = 0;
    
    public FichaCartao(String numeroCartao, TipoCartao tipoCartao) {
        this.numeroCartao = numeroCartao;
        this.tipoCartao = tipoCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public double getSaldo() {
        return tipoCartao.getLimiteCredito() - debitoAtual;
    }

	public void registrarCompra(double valorCompra) {
		debitoAtual = debitoAtual + valorCompra;
	}
}