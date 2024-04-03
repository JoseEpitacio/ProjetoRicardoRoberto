import java.util.Date;


public class Main {
    public static void main(String[] args) {

        ContaDeLuz[] contas = {
                new ContaDeLuz(
                        1,
                        new Date(2023, 5, 10),
                        "1234",
                        385.0,
                        250.0,
                        new Date(2023, 6, 10)),

                new ContaDeLuz(
                        2,
                        new Date(2023, 7, 10),
                        "2345",
                        405.0,
                        280.60,
                        new Date(2023, 8, 10)),

                new ContaDeLuz(
                        3,
                        new Date(2023, 9, 10),
                        "3456",
                        335.0,
                        210.89,
                        new Date(2023, 10, 10)),

                new ContaDeLuz(
                        4,
                        new Date(2023, 11, 10),
                        "5678",
                        600.0,
                        320.0,
                        new Date(2023, 12, 10))
        };

        double menorConsumo = Double.MAX_VALUE;
        double maiorConsumo = Double.MIN_VALUE;

        for (ContaDeLuz conta : contas) {
            System.out.println(conta);

            if (conta.getMediaConsumo() < menorConsumo) {
                menorConsumo = conta.getMediaConsumo();
            } else if (conta.getMediaConsumo() > maiorConsumo) {
                maiorConsumo = conta.getMediaConsumo();
            }
        }

        System.out.println("O menor consumo foi de : R$ " + String.format("%.2f", menorConsumo));
        System.out.println("O maior consumo foi de : R$ " + String.format("%.2f", maiorConsumo));
    }


}