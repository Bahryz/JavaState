

/**
 * CONCRETE STATE (Estado Concreto)
 * Implementa o comportamento do pedido quando ele está no estado "Novo".
 */
public class EstadoNovo implements EstadoPedido {

    @Override
    public void pagar(Order pedido) {
        // Ação válida: Mudar o estado do pedido para "Pago"
        pedido.setEstado(new EstadoPago());
        System.out.println("Pagamento recebido com sucesso.");
    }

    @Override
    public void enviar(Order pedido) {
        // Ação inválida
        System.out.println("ERRO: Não é possível enviar um pedido que ainda não foi pago.");
    }

    @Override
    public void entregar(Order pedido) {
        // Ação inválida
        System.out.println("ERRO: Não é possível entregar um pedido que não foi pago.");
    }

    @Override
    public void cancelar(Order pedido) {
        // Ação válida: Mudar o estado para "Cancelado"
        pedido.setEstado(new EstadoCancelado());
        System.out.println("Pedido cancelado com sucesso.");
    }
}
