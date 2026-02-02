import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in) ;
        int escolha = 0;
        String tipoMoeda = "";
        String moedaDesejada = "" ;
        double valorMoeda = 0;
        String menu = """
            **************************************************
            1) Dólar =>> Peso argentino
            2) Peso argentino =>> Dólar          
            3) Dólar =>> Real brasileiro  
            4) Real brasileiro   =>> Dólar 
            5) Dólar =>> Peso colombiano
            6) Peso colombiano =>> Dólar
            7) Sair
            ****************************************************
            Escolha uma opcao válida
            """;

        ConsultaApi novaConsulta = new ConsultaApi();


        while(escolha != 7){
            try{
                System.out.println(menu);
                escolha = leitura.nextInt();
                switch(escolha){
                    case 1:
                        tipoMoeda = "USD";
                        moedaDesejada = "ARS";
                        break;
                    case 2:
                        tipoMoeda = "ARS";
                        moedaDesejada = "USD";


                        break;
                    case 3:
                        tipoMoeda = "USD";
                        moedaDesejada= "BRL";


                        break;
                    case  4:
                        tipoMoeda = "BRL";
                        moedaDesejada = "USD";


                        break;
                    case 5:
                        tipoMoeda = "USD";
                        moedaDesejada= "COP";


                        break;
                    case 6:
                        tipoMoeda = "COP";
                        moedaDesejada = "USD";


                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Selecione uma opção válida");

                }
                if (escolha == 7){
                    System.out.println("Programa Finalizado");
                }else {
                    System.out.println("Digite o valor: ");
                    valorMoeda = leitura.nextDouble();
                    Moedas moeda1 = novaConsulta.consultaApi(tipoMoeda,moedaDesejada,valorMoeda);
                    System.out.println(moeda1);}
            } catch (Exception e){
                System.out.println("Deu erro: " + e.getMessage());
            }
        }

    }

}