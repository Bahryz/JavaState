public class EstadoEnviado implements EstadoPedido {

    @Override
    public void pagar(Order pedido) {
        System.out.println("AVISO: O pedido já foi pago e enviado.");
    }

    @Override
    public void enviar(Order pedido) {
        System.out.println("AVISO: O pedido já foi enviado.");
    }

    @Override
    public void entregar(Order pedido) {
        // Ação válida: Mudar para "Entregue"
        pedido.setEstado(new EstadoEntregue());
        System.out.println("Pedido entregue ao cliente.");
    }

    @Override
    public void cancelar(Order pedido) {
        // Ação inválida (regra de negócio)
        System.out.println("ERRO: Não é possível cancelar um pedido que já está em trânsito.");
    }
}
