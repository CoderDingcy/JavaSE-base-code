package day5.bms.user;

import day5.bms.book.BookList;
import day5.bms.operation.IOperation;

abstract public class User {
    protected String name;
    protected IOperation[] iOperations;

    public User(String name) {

        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
        this.iOperations[choice].work(bookList);
    }

}
