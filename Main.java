public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double normalParameters = service.calculate(60.00, 1.66);
        System.out.printf("%.2f", normalParameters);
        System.out.println();

        double weightIsTooLow = service.calculate(-60.00, 1.66);
        System.out.printf("%.2f", weightIsTooLow);
        System.out.println();

        double heightIsTooLow = service.calculate(60.00, -1.66);
        System.out.printf("%.2f", heightIsTooLow);
        System.out.println();

        double heightAndWeightAreTooLow = service.calculate(-60.00, -1.66);
        System.out.printf("%.2f", heightAndWeightAreTooLow);
        System.out.println();
    }
}