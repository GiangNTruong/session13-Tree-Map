package baitap.baitap3.ra.business.design;

public interface IGenericDesign<T,E> {
    T findById(E id);
    void addNewElement();
    void editElement();
    void deleteElement();
    void displayAll();
    T inputData(boolean isAdd);
    void sortNameReduce();
    T findByName(String name);
    void sortPriceIncrease();//tăng dân
    void sortPriceDecrease();// giam giá
}
