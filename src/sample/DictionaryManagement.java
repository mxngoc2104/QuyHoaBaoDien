package sample;

import java.util.Scanner;

public class DictionaryManagement extends Dictionary {
  public void insertFromCommandline() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số lượng từ vựng : ");
    int n = sc.nextInt();
    sc.nextLine();
    for (int i = 0;i < n; i++) {
      System.out.print("Nhập từ tiếng Anh : ");
      this.word_target = sc.nextLine();
      this.List.add(word_target);
      System.out.print("Nhập nghĩa tiếng Việt : ");
      this.word_explain = sc.nextLine();
      this.List.add(word_explain);
    }
    System.out.println("Bạn đã nhập xong!");
  }

  public void showAllWord() {
    System.out.println("No" + "\t" + "| English" + "\t" + "| Vietnamese" );
    for (int i =0; i < this.List.size(); i += 2) {
      System.out.print((i / 2) + 1 + "\t\t");
      System.out.println(this.List.get(i) + "\t\t" + this.List.get(i+1));
    }
  }

}
