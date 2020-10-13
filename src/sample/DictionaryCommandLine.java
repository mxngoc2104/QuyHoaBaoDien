package sample;

import java.util.Scanner;

public class DictionaryCommandLine extends DictionaryManagement{
  public void dictionaryBasic() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Xin chào bạn có muốn dùng từ điển không?");
    System.out.println("1.Có" + "\t" + "2.Không");
    System.out.print("Nhập lựa chọn : ");
    int n = sc.nextInt();
    if (n == 1) {
      this.insertFromCommandline();
      this.showAllWord();
    } else if (n == 2) {
      System.out.println("Chúc bạn 1 ngày tốt lành!");
    }
  }

  public static void main(String[] args) {
    DictionaryCommandLine tudien = new DictionaryCommandLine();
    tudien.dictionaryBasic();
  }
}
