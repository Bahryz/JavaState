public class EstadoPago implements EstadoPedido {

    @Override
    public void pagar(Order pedido) {
        // Ação inválida
        System.out.println("AVISO: O pedido já foi pago anteriormente.");
    }

    @Override
    public void enviar(Order pedido) {
        // Ação válida: Mudar o estado para "Enviado"
        pedido.setEstado(new EstadoEnviado());
        System.out.println("Pedido enviado para o cliente.");
    }

    @Override
    public void entregar(Order pedido) {
        // Ação inválida
        System.out.println("ERRO: Não é possível entregar um pedido que ainda não foi enviado.");
    }

    @Override
    public void cancelar(Order pedido) {
        // Ação válida: Mudar para "Cancelado" (e talvez iniciar reembolso)
        pedido.setEstado(new EstadoCancelado());
        System.out.println("Pedido cancelado. Processo de reembolso iniciado.");
    }
}