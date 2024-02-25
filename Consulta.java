public class Consulta {
    private String medico;
    private String horario;
    private String especialidade;

    public void setMedico(String medico){
        this.medico = medico;
    }
    public String getMedico(){
        return medico;
    }
    
    public void setHorario(String horario){
        this.horario = horario;
    }
    public String getHorario(){
        return horario;
    }

    public String resposta(){
        return "Sua consulta está marcada com: "+medico+" no horário das "+horario+".";
    }
}