package facade.subsistema2;

public class ApiCEP {
    private static ApiCEP instancia = new ApiCEP();
    private ApiCEP() {}

    public static ApiCEP getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Campos";
    }

    public String recuperarEstado(String cep) {
        return "RJ";
    }
}
