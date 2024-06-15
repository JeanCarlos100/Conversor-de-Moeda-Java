import java.util.Map;

public class Moeda {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public Moeda(String moedaAtual) {
        this.base_code = moedaAtual;
    }

    public String getMoedaAtual() {
        return base_code;
    }

    public Map<String, Double> getMoedaConvestida() {
        return conversion_rates;
    }

    @Override
    public String toString() {
        return "Moeda{" +
                "moedaAtual='" + base_code + '\'' +
                ", moedaConvestida='" + conversion_rates + '\'' +
                '}';
    }
}
