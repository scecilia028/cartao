package cartao;

public class Lojista {

    public static void main(String[] args) {
        
        ServicosCredito servico = new EmpresaCartaoCredito();
        
        boolean statusCompra = servico.registrarCompra("123", 200);

        System.out.println(statusCompra);
        double saldoAtual = servico.verificarSaldo("123");
        System.out.println(saldoAtual);
    }
}