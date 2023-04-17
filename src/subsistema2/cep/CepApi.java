package subsistema2.cep;

public class CepApi {

    private  static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }
    public static CepApi getInstancia(){
        return instancia;

    }
    public String recuerarCidade(String cep){
        return "Araraquara";
    }
    public String recuerarEstado(String cep){
        return "SP";
    }


}
