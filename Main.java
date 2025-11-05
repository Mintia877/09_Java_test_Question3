package org.example;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

  // 課題
  // 今日実践したものを一通り実践してみてください。（classのインスタンス生成、インターフェース）
  // Greeting　と　Speakingは使わずにinterfaceと実装を組み合わせて作ってみてください。
  // interfaceの実装を2つ以上作ってください。
  // 継承を使ってみてください。extends　上記で作った2つの実装クラスのどちらかを継承してクラスを作って
  // 実際にメソッドを呼び出してみてください。
  // メソッド呼び出しは親子のどちらとも呼び出してみてください。
  
  public static void main(String[] args) {
    // 注文内容についての会話をインスタンス生成して表示
    Order order = new Order();
    String message = order.orderMenu("Hunberger");

    Printer printer = new Printer();
    printer.printMessage(message);

    // 値段についての会話をインスタンス生成して表示
    Order order2 = new Order();
    String message2 = order2.orderPrice("1200円");

    Printer printer2 = new Printer();
    printer2.printMessage(message2);

    // インターフェースを実装
    Accounting greeting = new Order();
    String message3 = greeting.accounting("ご来店ありがとうございます、またのご来店をお待ちしております。");

    Printer printer3 = new Printer();
    printer3.printMessage(message3);

  }

}