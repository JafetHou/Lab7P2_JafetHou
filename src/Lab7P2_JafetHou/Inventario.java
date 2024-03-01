
package Lab7P2_JafetHou;


public class Inventario {
    
    private int id, categoria;
    private String nombre;
    private double price;
    private int bin, aisle;

    public Inventario() {
    }

    public Inventario(int id, int categoria, String nombre, double price, int bin, int aisle) {
        this.id = id;
        this.categoria = categoria;
        this.nombre = nombre;
        this.price = price;
        this.bin = bin;
        this.aisle = aisle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBin() {
        return bin;
    }

    public void setBin(int bin) {
        this.bin = bin;
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    @Override
    public String toString() {
        return "Inventario" + "id=" + id + ", categoria=" + categoria + ", nombre=" + nombre + ", price=" + price + ", bin=" + bin + ", aisle=" + aisle + '}';
    }
    
    
    
    
    
}
