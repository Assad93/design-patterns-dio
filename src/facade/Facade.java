package facade;

import facade.subsistema1.Crm;
import facade.subsistema2.ApiCEP;

public class Facade {
    public void migrarClientes(String nome, String CEP){
        String cidade = ApiCEP.getInstancia().recuperarCidade(CEP);
        String estado = ApiCEP.getInstancia().recuperarEstado(CEP);

        Crm.gravarCliente(nome, CEP, cidade, estado);
    }
}
