
public class Main {
    public static void main(String[] args) {
        
        // 1. Cliente cria um pedido
        Order pedido = new Order(); // Começa como "Novo"
        System.out.println("");

        // 2. Cliente tenta enviar antes de pagar (deve falhar)
        System.out.println("Tentando enviar o pedido...");
        pedido.enviar();
        System.out.println("");

        // 3. Cliente paga (deve funcionar)
        System.out.println("Tentando pagar o pedido...");
        pedido.pagar();
        System.out.println("");

        // 4. Cliente tenta pagar de novo (deve dar aviso)
        System.out.println("Tentando pagar o pedido de novo...");
        pedido.pagar();
        System.out.println("");

        // 5. Cliente tenta cancelar (deve funcionar e reembolsar)
        // pedido.cancelar(); // Descomente esta linha para testar o cancelamento
        // System.out.println("");
        
        // 6. Loja envia o pedido (deve funcionar)
        System.out.println("Tentando enviar o pedido...");
        pedido.enviar();
        System.out.println("");

        // 7. Cliente tenta cancelar (deve falhar)
        System.out.println("Tentando cancelar o pedido...");
        pedido.cancelar();
        System.out.println("");

        // 8. Transportadora entrega o pedido (deve funcionar)
        System.out.println("Tentando entregar o pedido...");
        pedido.entregar();
        System.out.println("");

        // 9. Cliente tenta pagar de novo (deve dar aviso)
        System.out.println("Tentando pagar um pedido já entregue...");
        pedido.pagar();
    }
}
