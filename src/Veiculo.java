public class Veiculo{
    
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String placa;
    
    public Veiculo(String marca,String modelo,String cor,String placa,int ano){
        this.marca = marca; this.modelo = modelo;this.cor = cor; this.placa = placa;this.ano = ano;
    }

    public Veiculo(String marca,String modelo,String cor,int ano) {
        this.marca = marca; this.modelo = modelo;this.cor = cor;this.ano = ano;
    }
    
    
    
    
    
    
    
    
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    

}