package baitap.baitap3.ra.presentation;

import baitap.baitap3.ra.business.design.IdProduct;
import baitap.baitap3.ra.business.designimpl.ProductImpl;
import baitap.baitap3.ra.business.entity.Product;
import baitap.baitap3.ra.config.InputMethods;

import java.util.Scanner;

public class Main {
    private static IdProduct productImpl = new ProductImpl();

    public static void main(String[] args) {

        while (true){
            System.out.println("-----------Product Menu ------------");
            System.out.println("1.\tThêm sản phẩm\n" +
                    "2.\tSửa thông tin sản phẩm theo id\n" +
                    "3.\tXóa sản phẩm theo id\n" +
                    "4.\tHiển thị danh sách sản phẩm\n" +
                    "5.\tTìm kiếm sản phẩm theo tên\n" +
                    "6.\tSắp xếp sản phẩm tăng dần, giảm dần theo giá\n");
            byte choice = InputMethods.getByte();
            switch (choice){
                case 1: productImpl.addNewElement();
                break;
                case 2: productImpl.editElement();
                break;
                case 3: productImpl.deleteElement();
                break;
                case 4: productImpl.displayAll();
                break;
                case 5:
                    System.out.println("Nhập tên sản phẩm muốn tìm");
                    String name = InputMethods.getString();
                    Product foundProduct = productImpl.findByName(name);
                    if (foundProduct != null) {
                        System.out.println("Đã tìm thấy sản phẩm: " + foundProduct);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm với tên: " + name);
                    }
                break;
                case 6: productImpl.sortPriceDecrease();//giảm dan
                        break;
                default:
                    System.out.println("Khong hop ly");
                    break;
            }
        }
    }
}