package org.example;

public class Order implements Accounting {

  public String orderMenu(String food) {
    return "ご注文のメニューは" + food+ "です。";
  }

  public String orderPrice(String price) {
    return "お会計は" + price + "です。お買い上げありがとうございます。";
  }

  @Override
  public String accounting(String message) {
    return message;




  }
}
