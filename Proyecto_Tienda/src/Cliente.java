public class Cliente {
    private String Cedula;
    private String CedulaExtranjera;

    public void clienteCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCedula(){
        return Cedula;
    }

    public void setCedula(String Cedula){
        this.Cedula = Cedula;
    }
    public void clienteCedulaExtranjera(String CedulaExtranjera) {
        this.CedulaExtranjera = CedulaExtranjera;
    }

    public String getCedulaExtranjera(){
        return CedulaExtranjera;
    }

    public void setCedulaExtranjera(String CedulaExtranjera){
        this.CedulaExtranjera = CedulaExtranjera;
    }

}
