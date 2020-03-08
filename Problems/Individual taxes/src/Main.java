import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCompanies = scanner.nextInt();

        double[] incomes = new double[numberOfCompanies];
        double[] percent = new double[numberOfCompanies];
        double[] taxes = new double[numberOfCompanies];

        for (int i = 0; i < incomes.length; i++) {
            incomes[i] = scanner.nextDouble();
        }

        for (int i = 0; i < percent.length; i++) {
            percent[i] = scanner.nextDouble();
        }

        int temp = 0;

        for (int i = 0; i < taxes.length; i++) {
            taxes[i] = (incomes[i] * percent[i] / 100);

            if (i > 0 && taxes[i] > taxes[i - 1]) {
                temp = i;
            }
        }

        double[] copyOfTaxes = taxes.clone();
        Arrays.sort(copyOfTaxes);

        if (copyOfTaxes.length > 1 && copyOfTaxes[copyOfTaxes.length - 1] == copyOfTaxes[copyOfTaxes.length - 2]) {
            for (int i = 0; i < taxes.length; i++) {
                if (taxes[i] == copyOfTaxes[0]) {
                    temp = i;
                    break;
                }
            }
        }

        System.out.println(temp + 1);
    }
}
