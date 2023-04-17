package Facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
    public void migrarCiente(String nome,String cep){
        String cidade = CepApi.getInstancia().recuerarCidade(cep);
        String estado = CepApi.getInstancia().recuerarEstado(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);

    }

}
