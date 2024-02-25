import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Consulta nova = new Consulta();

        String medico1 = "Rogério Fagundes";
        String medico2 = "Cristian Figueiredo";
        String medico3 = "Marcos Claus";
        String medico4 = "Renata Albuquerque";
        String medico5 = "Antônio Fernandes";
        String medico6 = "Roger Henrique";
        String medico7 = "João Pedro";
        String medico8 = "Gabriel Melo";
        String medico9 = "Jussara Lopes";

        String especMed1 = "Cirurgião Cardiologista";
        String especMed2 = "Cirurgião Otorrino";
        String especMed3 = "Cirurgião Oftamologista";
        String especMed4 = "Ecocardiografia";
        String especMed5 = "Cardiologia Geriátrica";
        String especMed6 = "Oncologia";
        String especMed7 = "Laringologia";
        String especMed8 = "Oftalmoplástica";
        String especMed9 = "Catarata";

        String horario1 = "08:00h";
        String horario2 = "09:00h";
        String horario3 = "10:00h";
        String horario4 = "11:00h";
        String horario5 = "14:00h";
        String horario6 = "15:00h";
        String horario7 = "16:00h";
        String horario8 = "17:00h";
        String horario9 = "18:00h";

        ArrayList<String> medicos = new ArrayList<String>();

        medicos.add(medico1);
        medicos.add(medico2);
        medicos.add(medico3);
        medicos.add(medico4);
        medicos.add(medico5);
        medicos.add(medico6);
        medicos.add(medico7);
        medicos.add(medico8);
        medicos.add(medico9);
        
        ArrayList<String> especialidades = new ArrayList<String>();

        especialidades.add(especMed1);
        especialidades.add(especMed2);
        especialidades.add(especMed3);
        especialidades.add(especMed4);
        especialidades.add(especMed5);
        especialidades.add(especMed6);
        especialidades.add(especMed7);
        especialidades.add(especMed8);
        especialidades.add(especMed9);
        
        ArrayList<String> horarios = new ArrayList<String>();

        horarios.add(horario1);
        horarios.add(horario2);
        horarios.add(horario3);
        horarios.add(horario4);
        horarios.add(horario5);
        horarios.add(horario6);
        horarios.add(horario7);
        horarios.add(horario8);
        horarios.add(horario9);

        Scanner in = new Scanner(System.in);

        System.out.println("=========Bem-vindo(a) a Clínica Excel=========");
        System.out.println("Nosso atendimento é de segunda à sexta-feira das 8h às 18h");
        System.out.println("\nDigite 1 para marcar uma consulta");
        int consulta = in.nextInt();

        if (consulta == 1){
            do{
                System.out.println("=========Digite a área desejada=========");
                System.out.println("1 - Cardiologia");
                System.out.println("2 - Otorrinolaringologia");
                System.out.println("3 - Oftalmologia");
                System.out.println("4 - Sair");
                System.out.println("=========================================");
                int opcao = in.nextInt();

                if (opcao != 4){
                    switch (opcao) {
                        case 1:
                            System.out.println("=========Médicos disponíveis=========");
                            System.out.println("1 - " + medicos.get(0)+" (Cirurgião Cardiologista)");
                            System.out.println("2 - " + medicos.get(3)+" (Ecocardiografia)");
                            System.out.println("3 - " + medicos.get(4)+" (Cardiologia Geriátrica)");
                            System.out.println("=====================================");
                            System.out.println("\nEscolha seu médico: ");
                            int cardiologia = in.nextInt();
                            switch (cardiologia) {
                                case 1:
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("Você escolheu o médico: "+medicos.get(0)+"\n\nEspecialidade: "+especialidades.get(0)+"\n\nEscolha o horário para a consulta: ");
                                    System.out.println("1 - "+horarios.get(0)+"\n2 - "+horarios.get(1)+"\n3 - "+horarios.get(2)+"\n4 - "+horarios.get(3)+"\n5 - "+horarios.get(4)+"\n6 - "+horarios.get(5)+"\n7 - "+horarios.get(6)+"\n8 - "+horarios.get(7)+"\n9 - "+horarios.get(8));
                                    System.out.println("-------------------------------------------------");
                                    int horarioCard = in.nextInt();
                                    switch (horarioCard){
                                        case 1:
                                            nova.setMedico(medicos.get(0));
                                            nova.setHorario(horarios.get(0));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 2:
                                            nova.setMedico(medicos.get(0));
                                            nova.setHorario(horarios.get(1));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 3:
                                            nova.setMedico(medicos.get(0));
                                            nova.setHorario(horarios.get(2));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 4:
                                            nova.setMedico(medicos.get(0));
                                            nova.setHorario(horarios.get(3));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 5:
                                            nova.setMedico(medicos.get(0));
                                            nova.setHorario(horarios.get(4));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 6:
                                            nova.setMedico(medicos.get(0));
                                            nova.setHorario(horarios.get(5));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 7:
                                            nova.setMedico(medicos.get(0));
                                            nova.setHorario(horarios.get(6));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 8:
                                            nova.setMedico(medicos.get(0));
                                            nova.setHorario(horarios.get(7));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 9:
                                            nova.setMedico(medicos.get(0));
                                            nova.setHorario(horarios.get(8));
                                            System.out.println(nova.resposta());
                                            break;
                                    }
                                    break;
                                    
                                    case 2:
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("Você escolheu o médico: "+medicos.get(3)+"\n\nEspecialidade: "+especialidades.get(3)+"\n\nEscolha o horário para a consulta: ");
                                    System.out.println("1 - "+horarios.get(0)+"\n2 - "+horarios.get(1)+"\n3 - "+horarios.get(2)+"\n4 - "+horarios.get(3)+"\n5 - "+horarios.get(4)+"\n6 - "+horarios.get(5)+"\n7 - "+horarios.get(6)+"\n8 - "+horarios.get(7)+"\n9 - "+horarios.get(8));
                                    System.out.println("-------------------------------------------------");
                                    int horarioCard2 = in.nextInt();
                                    switch (horarioCard2){
                                        case 1:
                                            nova.setMedico(medicos.get(3));
                                            nova.setHorario(horarios.get(0));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 2:
                                            nova.setMedico(medicos.get(3));
                                            nova.setHorario(horarios.get(1));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 3:
                                            nova.setMedico(medicos.get(3));
                                            nova.setHorario(horarios.get(2));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 4:
                                            nova.setMedico(medicos.get(3));
                                            nova.setHorario(horarios.get(3));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 5:
                                            nova.setMedico(medicos.get(3));
                                            nova.setHorario(horarios.get(4));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 6:
                                            nova.setMedico(medicos.get(3));
                                            nova.setHorario(horarios.get(5));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 7:
                                            nova.setMedico(medicos.get(3));
                                            nova.setHorario(horarios.get(6));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 8:
                                            nova.setMedico(medicos.get(3));
                                            nova.setHorario(horarios.get(7));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 9:
                                            nova.setMedico(medicos.get(3));
                                            nova.setHorario(horarios.get(8));
                                            System.out.println(nova.resposta());
                                            break;
                                    }
                                    break;
                                    
                                    case 3:
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("Você escolheu o médico: "+medicos.get(4)+"\n\nEspecialidade: "+especialidades.get(4)+"\n\nEscolha o horário para a consulta: ");
                                    System.out.println("1 - "+horarios.get(0)+"\n2 - "+horarios.get(1)+"\n3 - "+horarios.get(2)+"\n4 - "+horarios.get(3)+"\n5 - "+horarios.get(4)+"\n6 - "+horarios.get(5)+"\n7 - "+horarios.get(6)+"\n8 - "+horarios.get(7)+"\n9 - "+horarios.get(8));
                                    System.out.println("-------------------------------------------------");
                                    int horarioCard3 = in.nextInt();
                                    switch (horarioCard3){
                                        case 1:
                                            nova.setMedico(medicos.get(4));
                                            nova.setHorario(horarios.get(0));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 2:
                                            nova.setMedico(medicos.get(4));
                                            nova.setHorario(horarios.get(1));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 3:
                                            nova.setMedico(medicos.get(4));
                                            nova.setHorario(horarios.get(2));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 4:
                                            nova.setMedico(medicos.get(4));
                                            nova.setHorario(horarios.get(3));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 5:
                                            nova.setMedico(medicos.get(4));
                                            nova.setHorario(horarios.get(4));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 6:
                                            nova.setMedico(medicos.get(4));
                                            nova.setHorario(horarios.get(5));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 7:
                                            nova.setMedico(medicos.get(4));
                                            nova.setHorario(horarios.get(6));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 8:
                                            nova.setMedico(medicos.get(4));
                                            nova.setHorario(horarios.get(7));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 9:
                                            nova.setMedico(medicos.get(4));
                                            nova.setHorario(horarios.get(8));
                                            System.out.println(nova.resposta());
                                            break;
                                    }
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("=========Médicos disponíveis=========");
                            System.out.println("1 - " + medicos.get(1)+" (Cirurgião Otorrino)");
                            System.out.println("2 - " + medicos.get(5)+" (Oncologia)");
                            System.out.println("3 - " + medicos.get(6)+" (Laringologia)");
                            System.out.println("=====================================");
                            int otorrino = in.nextInt();
                            switch (otorrino) {
                                case 1:
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("Você escolheu o médico: "+medicos.get(1)+"\n\nEspecialidade: "+especialidades.get(1)+"\n\nEscolha o horário para a consulta: ");
                                    System.out.println("1 - "+horarios.get(0)+"\n2 - "+horarios.get(1)+"\n3 - "+horarios.get(2)+"\n4 - "+horarios.get(3)+"\n5 - "+horarios.get(4)+"\n6 - "+horarios.get(5)+"\n7 - "+horarios.get(6)+"\n8 - "+horarios.get(7)+"\n9 - "+horarios.get(8));
                                    System.out.println("-------------------------------------------------");
                                    int horarioOto = in.nextInt();
                                    switch (horarioOto){
                                        case 1:
                                            nova.setMedico(medicos.get(1));
                                            nova.setHorario(horarios.get(0));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 2:
                                            nova.setMedico(medicos.get(1));
                                            nova.setHorario(horarios.get(1));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 3:
                                            nova.setMedico(medicos.get(1));
                                            nova.setHorario(horarios.get(2));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 4:
                                            nova.setMedico(medicos.get(1));
                                            nova.setHorario(horarios.get(3));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 5:
                                            nova.setMedico(medicos.get(1));
                                            nova.setHorario(horarios.get(4));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 6:
                                            nova.setMedico(medicos.get(1));
                                            nova.setHorario(horarios.get(5));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 7:
                                            nova.setMedico(medicos.get(1));
                                            nova.setHorario(horarios.get(6));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 8:
                                            nova.setMedico(medicos.get(1));
                                            nova.setHorario(horarios.get(7));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 9:
                                            nova.setMedico(medicos.get(1));
                                            nova.setHorario(horarios.get(8));
                                            System.out.println(nova.resposta());
                                            break;
                                    }
                                    break;
                                    
                                    case 2:
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("Você escolheu o médico: "+medicos.get(5)+"\n\nEspecialidade: "+especialidades.get(5)+"\n\nEscolha o horário para a consulta: ");
                                    System.out.println("1 - "+horarios.get(0)+"\n2 - "+horarios.get(1)+"\n3 - "+horarios.get(2)+"\n4 - "+horarios.get(3)+"\n5 - "+horarios.get(4)+"\n6 - "+horarios.get(5)+"\n7 - "+horarios.get(6)+"\n8 - "+horarios.get(7)+"\n9 - "+horarios.get(8));
                                    System.out.println("-------------------------------------------------");
                                    int horarioOto2 = in.nextInt();
                                    switch (horarioOto2){
                                        case 1:
                                            nova.setMedico(medicos.get(5));
                                            nova.setHorario(horarios.get(0));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 2:
                                            nova.setMedico(medicos.get(5));
                                            nova.setHorario(horarios.get(1));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 3:
                                            nova.setMedico(medicos.get(5));
                                            nova.setHorario(horarios.get(2));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 4:
                                            nova.setMedico(medicos.get(5));
                                            nova.setHorario(horarios.get(3));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 5:
                                            nova.setMedico(medicos.get(5));
                                            nova.setHorario(horarios.get(4));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 6:
                                            nova.setMedico(medicos.get(5));
                                            nova.setHorario(horarios.get(5));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 7:
                                            nova.setMedico(medicos.get(5));
                                            nova.setHorario(horarios.get(6));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 8:
                                            nova.setMedico(medicos.get(5));
                                            nova.setHorario(horarios.get(7));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 9:
                                            nova.setMedico(medicos.get(5));
                                            nova.setHorario(horarios.get(8));
                                            System.out.println(nova.resposta());
                                            break;
                                    }
                                    break;
                                    
                                    case 3:
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("Você escolheu o médico: "+medicos.get(6)+"\n\nEspecialidade: "+especialidades.get(6)+"\n\nEscolha o horário para a consulta: ");
                                    System.out.println("1 - "+horarios.get(0)+"\n2 - "+horarios.get(1)+"\n3 - "+horarios.get(2)+"\n4 - "+horarios.get(3)+"\n5 - "+horarios.get(4)+"\n6 - "+horarios.get(5)+"\n7 - "+horarios.get(6)+"\n8 - "+horarios.get(7)+"\n9 - "+horarios.get(8));
                                    System.out.println("-------------------------------------------------");
                                    int horarioOto3 = in.nextInt();
                                    switch (horarioOto3){
                                        case 1:
                                            nova.setMedico(medicos.get(6));
                                            nova.setHorario(horarios.get(0));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 2:
                                            nova.setMedico(medicos.get(6));
                                            nova.setHorario(horarios.get(1));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 3:
                                            nova.setMedico(medicos.get(6));
                                            nova.setHorario(horarios.get(2));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 4:
                                            nova.setMedico(medicos.get(6));
                                            nova.setHorario(horarios.get(3));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 5:
                                            nova.setMedico(medicos.get(6));
                                            nova.setHorario(horarios.get(4));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 6:
                                            nova.setMedico(medicos.get(6));
                                            nova.setHorario(horarios.get(5));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 7:
                                            nova.setMedico(medicos.get(6));
                                            nova.setHorario(horarios.get(6));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 8:
                                            nova.setMedico(medicos.get(6));
                                            nova.setHorario(horarios.get(7));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 9:
                                            nova.setMedico(medicos.get(6));
                                            nova.setHorario(horarios.get(8));
                                            System.out.println(nova.resposta());
                                            break;
                                    }
                                    break;
                            }
                            break;

                        case 3:
                            System.out.println("=========Médicos disponíveis=========");
                            System.out.println("1 - " + medicos.get(2)+" (Cirurgião Oftalmologista)");
                            System.out.println("2 - " + medicos.get(7)+" (Oftalmoplástica)");
                            System.out.println("3 - " + medicos.get(8)+" (Catarata)");
                            System.out.println("=====================================");
                            int oftalmo = in.nextInt();
                            switch (oftalmo) {
                                case 1:
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("Você escolheu o médico: "+medicos.get(2)+"\n\nEspecialidade: "+especialidades.get(2)+"\n\nEscolha o horário para a consulta: ");
                                    System.out.println("1 - "+horarios.get(0)+"\n2 - "+horarios.get(1)+"\n3 - "+horarios.get(2)+"\n4 - "+horarios.get(3)+"\n5 - "+horarios.get(4)+"\n6 - "+horarios.get(5)+"\n7 - "+horarios.get(6)+"\n8 - "+horarios.get(7)+"\n9 - "+horarios.get(8));
                                    System.out.println("-------------------------------------------------");
                                    int horarioOft = in.nextInt();
                                    switch (horarioOft){
                                        case 1:
                                            nova.setMedico(medicos.get(2));
                                            nova.setHorario(horarios.get(0));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 2:
                                            nova.setMedico(medicos.get(2));
                                            nova.setHorario(horarios.get(1));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 3:
                                            nova.setMedico(medicos.get(2));
                                            nova.setHorario(horarios.get(2));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 4:
                                            nova.setMedico(medicos.get(2));
                                            nova.setHorario(horarios.get(3));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 5:
                                            nova.setMedico(medicos.get(2));
                                            nova.setHorario(horarios.get(4));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 6:
                                            nova.setMedico(medicos.get(2));
                                            nova.setHorario(horarios.get(5));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 7:
                                            nova.setMedico(medicos.get(2));
                                            nova.setHorario(horarios.get(6));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 8:
                                            nova.setMedico(medicos.get(2));
                                            nova.setHorario(horarios.get(7));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 9:
                                            nova.setMedico(medicos.get(2));
                                            nova.setHorario(horarios.get(8));
                                            System.out.println(nova.resposta());
                                            break;
                                    }
                                    break;
                                    
                                case 2:
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("Você escolheu o médico: "+medicos.get(7)+"\n\nEspecialidade: "+especialidades.get(7)+"\n\nEscolha o horário para a consulta: ");
                                    System.out.println("1 - "+horarios.get(0)+"\n2 - "+horarios.get(1)+"\n3 - "+horarios.get(2)+"\n4 - "+horarios.get(3)+"\n5 - "+horarios.get(4)+"\n6 - "+horarios.get(5)+"\n7 - "+horarios.get(6)+"\n8 - "+horarios.get(7)+"\n9 - "+horarios.get(8));
                                    System.out.println("-------------------------------------------------");
                                    int horarioOft2 = in.nextInt();
                                    switch (horarioOft2){
                                        case 1:
                                            nova.setMedico(medicos.get(7));
                                            nova.setHorario(horarios.get(0));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 2:
                                            nova.setMedico(medicos.get(7));
                                            nova.setHorario(horarios.get(1));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 3:
                                            nova.setMedico(medicos.get(7));
                                            nova.setHorario(horarios.get(2));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 4:
                                            nova.setMedico(medicos.get(7));
                                            nova.setHorario(horarios.get(3));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 5:
                                            nova.setMedico(medicos.get(7));
                                            nova.setHorario(horarios.get(4));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 6:
                                            nova.setMedico(medicos.get(7));
                                            nova.setHorario(horarios.get(5));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 7:
                                            nova.setMedico(medicos.get(7));
                                            nova.setHorario(horarios.get(6));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 8:
                                            nova.setMedico(medicos.get(7));
                                            nova.setHorario(horarios.get(7));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 9:
                                            nova.setMedico(medicos.get(7));
                                            nova.setHorario(horarios.get(8));
                                            System.out.println(nova.resposta());
                                            break;
                                    }
                                    break;

                                case 3:
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("Você escolheu o médico: "+medicos.get(8)+"\n\nEspecialidade: "+especialidades.get(8)+"\n\nEscolha o horário para a consulta: ");
                                    System.out.println("1 - "+horarios.get(0)+"\n2 - "+horarios.get(1)+"\n3 - "+horarios.get(2)+"\n4 - "+horarios.get(3)+"\n5 - "+horarios.get(4)+"\n6 - "+horarios.get(5)+"\n7 - "+horarios.get(6)+"\n8 - "+horarios.get(7)+"\n9 - "+horarios.get(8));
                                    System.out.println("-------------------------------------------------");
                                    int horarioOft3 = in.nextInt();
                                    switch (horarioOft3){
                                        case 1:
                                            nova.setMedico(medicos.get(8));
                                            nova.setHorario(horarios.get(0));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 2:
                                            nova.setMedico(medicos.get(8));
                                            nova.setHorario(horarios.get(1));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 3:
                                            nova.setMedico(medicos.get(8));
                                            nova.setHorario(horarios.get(2));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 4:
                                            nova.setMedico(medicos.get(8));
                                            nova.setHorario(horarios.get(3));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 5:
                                            nova.setMedico(medicos.get(8));
                                            nova.setHorario(horarios.get(4));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 6:
                                            nova.setMedico(medicos.get(8));
                                            nova.setHorario(horarios.get(5));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 7:
                                            nova.setMedico(medicos.get(8));
                                            nova.setHorario(horarios.get(6));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 8:
                                            nova.setMedico(medicos.get(8));
                                            nova.setHorario(horarios.get(7));
                                            System.out.println(nova.resposta());
                                            break;
                                        case 9:
                                            nova.setMedico(medicos.get(8));
                                            nova.setHorario(horarios.get(8));
                                            System.out.println(nova.resposta());
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                }else{
                    in.close();
                }
            }while(consulta != 4);
        }else{ 
            System.out.println("Valor inválido");
        }
    }
}
