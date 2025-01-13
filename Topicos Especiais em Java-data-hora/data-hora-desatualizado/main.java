import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        // Obter a data e hora atual
        Date agora = new Date();
        System.out.println("Data e hora atual: " + agora);

        // Formatar a data e hora
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = formatador.format(agora);
        System.out.println("Data e hora formatada: " + dataHoraFormatada);

        // Usar o Calendar para manipulação
        Calendar calendario = Calendar.getInstance();
        int ano = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH) + 1; // Mês é zero-based
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int hora = calendario.get(Calendar.HOUR_OF_DAY); // Hora no formato 24h
        int minuto = calendario.get(Calendar.MINUTE);
        int segundo = calendario.get(Calendar.SECOND);

        System.out.println("Ano: " + ano);
        System.out.println("Mês: " + mes);
        System.out.println("Dia: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("Minuto: " + minuto);
        System.out.println("Segundo: " + segundo);

        // Criar uma data específica usando Calendar
        Calendar dataEspecifica = Calendar.getInstance();
        dataEspecifica.set(2025, Calendar.JANUARY, 1, 12, 0, 0); // Lembre-se: Janeiro é mês 0
        Date dataEspecificaDate = dataEspecifica.getTime();
        System.out.println("Data e hora específica: " + formatador.format(dataEspecificaDate));

        // Comparar datas
        if (agora.before(dataEspecificaDate)) {
            System.out.println("A data atual é antes de 01/01/2025 12:00:00");
        } else {
            System.out.println("A data atual é depois de 01/01/2025 12:00:00");
        }
    }
}
