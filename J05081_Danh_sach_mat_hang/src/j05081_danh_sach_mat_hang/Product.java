/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package j05081_danh_sach_mat_hang;

/**
 *
 * @author Phung Thi Thu Anh
 */
class Product implements Comparable<Product> {
    private String ma, name, unit;
    private long priceBuy, priceSell;
    private long profit;
    public Product(int id, String name, String unit, long priceBuy, long priceSell) {
        this.ma = String.format("MH%03d", id); 
        this.name = name;
        this.unit = unit;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
        this.profit = priceSell - priceBuy; 
    }
    @Override
    public int compareTo(Product o) {
        if (this.profit != o.profit) {
            return Long.compare(o.profit, this.profit);
        } else {
            return this.ma.compareTo(o.ma);
        }
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + unit + " " + priceBuy + " " + priceSell + " " + profit;
    }
}
