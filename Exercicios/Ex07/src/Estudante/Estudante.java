package Estudante;

public class Estudante {
    public String nome;
    public double NotasA, NotasB, NotasC;

    public double notaFinal(){
        return NotasA + NotasB + NotasC;
    }
    public double PontosFaltando(){

        if(notaFinal() > 60.00){
            return 60.0 - notaFinal();
        } else {
            return 0.0;
        }
    }
}
