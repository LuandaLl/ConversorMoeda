public record Moedas(String base_code, String target_code, double conversion_result) {
    @Override
    public String toString() {
        return "Resultado: " + conversion_result + " [" + target_code + "]";
    }
}