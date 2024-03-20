package baitap.baitap3.ra.business.design;

import baitap.baitap3.ra.business.entity.Product;

public interface IdProduct extends IGenericDesign<Product,Integer>{
int getNewId();
}
