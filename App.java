package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import moder.entities.Paciente;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        List<Paciente> list = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        
        System.out.println();
        System.out.println("INFORMAÇÕES");
        System.out.print("CPF ENFERMEIRA: ");
        String CPF = scan.nextLine();
        System.out.print("INFORME O NOME DA ENFERMEIRA: ");
        String nome = scan.nextLine();
        
        System.out.println();
        System.out.printf("Enfermeira: %s CPF: %s \n",nome.toUpperCase(),CPF);

        UI.mostrarMenu();
        int opt = scan.nextInt();
        
        do{
            switch (opt){
                case 1:
                    System.out.println("INFORME A QUANTIDADE DE PACIENTES");
                    int number = scan.nextInt();
                    for (int i = 1; i <= number; i++) {
                        System.out.println("PACIENTE #"+i);
                        System.out.print("CPF: ");
                        scan.nextLine();
                        String cpf = scan.nextLine();
                        System.out.println("Nome: ");
                        String Nome = scan.nextLine();
                        System.out.println("===VACINAS===");
                        System.out.println("INFORME A DATA DA PRIMEIRA DOSE: ");
                        Date dose1 = sdf.parse(scan.next());
                        System.out.println("INFORME A DATA DA SEGUNDA DOSE: ");
                        Date dose2 = sdf.parse(scan.next());
                        System.out.println("INFORME A DATA DA TERCEIRA DOSE: ");
                        Date dose3 = sdf.parse(scan.next());
                        System.out.println("INFORME A DATA DA QUARTA DOSE: ");
                        Date dose4 = sdf.parse(scan.next());

                        list.add(new Paciente(cpf, Nome, dose1, dose2, dose3, dose4));
                        if (dose1.before(dose2) && dose3.before(dose4)) {
                            Calendar cal = Calendar.getInstance();
                            cal.setTime(dose1);
                            cal.add(Calendar.MONTH ,4);
                            dose1 = cal.getTime();
                            

                            cal.setTime(dose3);
                            cal.add(Calendar.MONTH ,4);
                            dose3 = cal.getTime();    
                            if (dose1.equals(dose2) && dose3.equals(dose4)) {
                                System.out.println("CIDADÃO CADASTRADO");
                            }
                            else{
                                System.out.println("O CIDADÃO AINDA NÃO TEM DIREITO A UMA NOVA DATA");
                            }
                        }
                    }
                    UI.mostrarMenu();
                    opt = scan.nextInt();
                    break;
                case 2:
                    for (Paciente paciente : list) {
                        System.out.println(paciente);
                    }
                    UI.mostrarMenu();
                    opt = scan.nextInt();
                    break;
                    
                    default:
                    System.out.println("OPÇÃO INVALIDA");
                    UI.mostrarMenu();
                    opt = scan.nextInt();
                    break;        
            }
        } while (opt != 3);
        scan.close();
    }
}
