import java.util.Scanner;

public class main {
    public static  void main (String[] arg){
        Scanner entrada = new Scanner(System.in);

        double investimento;
        double views;
        double clicks;
        double compartilhamento;
        String anuncio;
        String cliente;
        int DataCD;
        int DataCM;
        int DataTD;
        int DataTM;

        System.out.println(" ---------------------------");
        System.out.println("|Informe o nome do anúncio: |");
        System.out.println(" ---------------------------");
        anuncio = entrada.next();

        System.out.println(" ---------------------------");
        System.out.println("|Informe o nome do cliente: |");
        System.out.println(" ---------------------------");
        cliente = entrada.next();

        System.out.println(" ---------------------------------------");
        System.out.println("|Informe quanto será investido por dia: |");
        System.out.println(" ---------------------------------------");
        investimento = entrada.nextDouble();
        if (investimento <= 0){
            System.out.println(" ------------------------------------------------------------------");
            System.out.println("|Não tem como investir R$0.00 ou menos porfavor informe outro valor|");
            System.out.println(" ------------------------------------------------------------------");
        }

        System.out.println("Informe a data de início:");
        DataCD = entrada.nextInt();
        System.out.println(DataCD+" / "+" / ");
        DataCM = entrada.nextInt();
        System.out.println(DataCD+" / "+DataCM+" / 2021 ");


        System.out.println("Informe a data de término:");
        DataTD = entrada.nextInt();
        System.out.println(DataTD+" / "+" / ");
        DataTM = entrada.nextInt();
        System.out.println(DataTD+" / "+DataTM+" / 2021 ");


        var data_dia= (DataTD - DataCD);
        var data_mes=(DataTM - DataCM);
        var result_data=(data_mes * 30) + data_dia;

        views = (investimento * 30) * result_data;
        clicks = views * 0.12;
        compartilhamento = (clicks * 0.15) * 4;

        System.out.println(" ------------------------------------------------------------");
        System.out.println("|Nome do anúncio: "+ anuncio+"                                          |");
        System.out.println("|Nome do cliente: "+ cliente+"                                          |");
        System.out.println("|Valor investido: "+investimento+"                                        |");
        System.out.println("|Quantidade máxima de visualizações: "+views+"                     |");
        System.out.println("|Quantidade máxima de cliques:"+clicks+"                            |");
        System.out.println("|Quantidade máxima de compartilhamentos: "+compartilhamento+"                 |");
        System.out.println(" ------------------------------------------------------------");






    }
}
