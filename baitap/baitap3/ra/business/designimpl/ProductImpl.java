package baitap.baitap3.ra.business.designimpl;

import baitap.baitap3.ra.business.design.IdProduct;
import baitap.baitap3.ra.business.entity.Product;
import baitap.baitap3.ra.config.InputMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductImpl implements IdProduct {
    private static List<Product> productList = new ArrayList<>();


    @Override
    public Product findById(Integer id) {
        for (Product p : productList){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public void addNewElement() {
        System.out.println("Nhập số lượng muốn thêm san phẩm");
        byte count = InputMethods.getByte();

        for (int i = 1; i <= count; i++) {
            System.out.println("Nhập thng tin cho sản ophaamr thứ" + i);
            Product product = inputData(true);
            productList.add(product);

        }
        System.out.println("Đã thêm thành công " + count  + "san pham");
    }

    @Override
    public void editElement() {
        System.out.println("Nhập id sản phẩm muốn sửa");
        int inEdit = InputMethods.getInteger();
        Product productEdit = findById(inEdit);
        if (productEdit == null){
            System.out.println("Khong tim thay");
        }else {
            System.out.println("Thông tin cũ là ");
            System.out.println(productEdit);
            System.out.println("Nhập thông tin mới");
            productEdit = inputData(false);
            productEdit.setId(inEdit);//ko thay đổi id
            productList.set(productList.indexOf(findById(inEdit)), productEdit);
            System.out.println("Đã cập nhật thong tin");

        }
    }

    @Override
    public void deleteElement() {
        System.out.println("Nhập id của san pham muon xóa");
        int idDel = InputMethods.getInteger();
        Product productDel = findById(idDel);
        if (productDel == null){
            System.err.println("khong tim thay");
        }else {
            productList.remove(productDel);
            System.out.println("Đã xóa");
        }
    }

    @Override
    public void displayAll() {
        if (productList.isEmpty()){
            System.err.println("danh sach rong");
        }else {
            for (Product p :productList){
                System.out.println(p);
            }
        }
    }

    @Override
    public Product inputData(boolean isAdd) {
      Product newPro = new Product();
      if (isAdd){
          newPro.setId(getNewId());//id tự tăng
          System.out.println("ID : " +newPro.getId());
      }
        System.out.println("Nhập tên : ");
      newPro.setName(InputMethods.getString());
        System.out.println("Nhập giá : ");
        newPro.setPrice(InputMethods.getDouble());
        System.out.println("Nhập số lượng : ");
        newPro.setQuantity(InputMethods.getInteger());
      return newPro;
    }

    @Override
    public void sortNameReduce() {

    }

    @Override
    public Product findByName(String name) {
        for (Product product : productList){
            if (product.getName().contains(name)){
                return product;
            }
        }
        System.out.println("Khong tim thay");
        return null;
    }

    @Override
    public void sortPriceIncrease() {//Tăng dần
        productList.sort(Comparator.comparing(Product::getPrice));
    }


    @Override
    public void sortPriceDecrease() {//Giảm dần
        productList.sort(Comparator.comparing(Product::getPrice).reversed());
    }

    @Override
    public int getNewId() {
        int idMax = 0;
        for (Product p : productList){
            if (idMax<p.getId()){
                idMax=p.getId();
            }
        }
        return idMax+1;
    }
}
