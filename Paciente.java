package moder.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Paciente extends Pessoa{
    private Date dose1;
    private Date dose2;
    private Date dose3;
    private Date dose4;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Paciente(String CPF, String nome, Date dose1, Date dose2, Date dose3, Date dose4){
        super(CPF, nome);
        this.dose1 = dose1;
        this.dose2 = dose2;
        this.dose3 = dose3;
        this.dose4 = dose4;   
    }

    public Date getdose1(){
        return dose1;
    }
    
    public void setdose1(Date dose1){
        this.dose1 = dose1;
    }

    public Date getdose2(){
        return dose2;
    }
    public void setdose2(Date dose2){
        this.dose2 = dose2;
    }
    public Date getdose3(){
        return dose3;
    }
    public void setdose3(Date dose3){
        this.dose3 = dose3;
    }
    public Date getdose4(){
        return dose4;
    }
    public void setdose4(Date dose4){
        this.dose4 = dose4;
    }

    @Override
    public String toString(){
        return "NOME: "
            +getnome()
            + "\n"
            +"CPF: "
            +getCPF()
            +"\n"
            +"VACINAS"
            +"\n"
            +"PRIMEIRA DOSE: "
            +sdf.format(dose1)
            +"\n"
            +"SEGUNDA DOSE: "
            +sdf.format(dose2)
            +"\n"
            +"TERCEIRA DOSE: "
            +sdf.format(dose3)
            +"\n"
            +"QUARTA DOSE: "
            +sdf.format(dose4)
            +"\n";
    }
}
