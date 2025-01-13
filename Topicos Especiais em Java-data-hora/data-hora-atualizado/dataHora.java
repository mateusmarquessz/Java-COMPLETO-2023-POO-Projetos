import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dataHora {
    public static void main(String[] args) {
        // Obter a data e hora atual
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Data e hora atual: " + agora);

        // Formatar a data e hora
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = agora.format(formatador);
        System.out.println("Data e hora formatada: " + dataHoraFormatada);

        // Obter partes específicas da data e hora
        int ano = agora.getYear();
        int mes = agora.getMonthValue();
        int dia = agora.getDayOfMonth();
        int hora = agora.getHour();
        int minuto = agora.getMinute();
        int segundo = agora.getSecond();

        System.out.println("Ano: " + ano);
        System.out.println("Mês: " + mes);
        System.out.println("Dia: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("Minuto: " + minuto);
        System.out.println("Segundo: " + segundo);

        // Trabalhar com uma data e hora específica
        LocalDateTime dataEspecifica = LocalDateTime.of(2025, 1, 1, 12, 0, 0);
        System.out.println("Data e hora específica: " + dataEspecifica);

        // Comparação de datas
        if (agora.isBefore(dataEspecifica)) {
            System.out.println("A data atual é antes de 01/01/2025 12:00:00");
        } else {
            System.out.println("A data atual é depois de 01/01/2025 12:00:00");
        }
    }
}
