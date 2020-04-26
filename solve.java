import java.util.Scanner;

class solve{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //size of array is three
    int bob[] = new int[3];
    int alice[] = new int[3];
    int bob_sum = 0 , alice_sum=0;
    for (int i=0;i<bob.length ; i++){
      bob[i] = sc.nextInt();
    }
    for (int i=0;i<alice.length ; i++){
      alice[i] = sc.nextInt();
    }
    for (int i=0;i<bob.length ; i++){
      if(bob[i]>alice[i]){
        bob_sum ++;
      }
      if(bob[i]<alice[i]){
        alice_sum++;
      }
    }
    System.out.println(bob_sum+" "+alice_sum);
  }
}
