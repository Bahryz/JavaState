public class EstadoEntregue implements EstadoPedido {

    @Override
    public void pagar(Order pedido) {
        System.out.println("AVISO: O pedido já foi entregue.");
    }

    @Override
    public void enviar(Order pedido) {
        System.out.println("AVISO: O pedido já foi entregue.");
    }

    @Override
    public void entregar(Order pedido) {
        System.out.println("AVISO: O pedido já foi entregue.");
    }

    @Override
    public void cancelar(Order pedido) {
        System.out.println("AVISO: Não é possível cancelar um pedido que já foi entregue.");
    }
}
