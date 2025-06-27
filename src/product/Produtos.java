package product;
import java.util.Objects;
public class Produtos {

    private String name;
    private String code;
    private double price;

    public Produtos(String name, String code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public String toString(){
        return "produtos: " + name + "code: " + code +  "price: R$" + String.format("%2f", price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Produtos other = (Produtos) obj;
        return Objects.equals(code, other.code);
    }

    @Override
    public int hashCode(){
        return Objects.hash(code);
    }
}