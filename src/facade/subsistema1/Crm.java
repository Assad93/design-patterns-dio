package facade.subsistema1;

public class Crm {
    private Crm() {

    }

    public static void gravarCliente(String nome, String CEP, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema de CRM");
    }
}
