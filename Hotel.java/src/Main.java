import java.util.*;
public class Main {
	public static void main(String[] args) {
		int l;
		int totalbill;
		int b;
		int k;
		int count;
		Scanner sc=new Scanner(System.in);
		
	int ch=0;
	do{
		int l1;
		switch(ch==0)
    {


    case 1:
        System.out.println("there are "+l+"quantities");
        int q=sc.nextInt();
        System.out.println("how many quantities u require"+q);
        System.out.println("prize is"+q*l1);
        
        totalbill=totalbill+(q*l1);
         k=fb-totalbill;
//        System.out.println(totalbill);
          int n=l-q;
          l=b;
          System.out.println("bill"+totalbill);
        System.out.println("available bal is"+k+"available quant is"+b);
        //count++;
        if(k>0)
            
            display();
        else
            break;
        
    case 2:
        System.out.println("there are "+p+"quantities");
        int q1=sc.nextInt();
        System.out.println("how many quantities u require"+q1);
        System.out.println("prize is"+q1*p1);
        
        totalbill=totalbill+(q1*p1);
        int k1=fb-totalbill;
        System.out.println("your bill is"+totalbill);
        int b1=l-q1;
        p=b1;
        System.out.println("available bal is"+k1+"available quant is"+b1);
        //count++;
        if(k1>=0)
            display();
        else
            break;
    case 3:
        System.out.println("there are "+f+"quantities");
        int q2=sc.nextInt();
        System.out.println("how many quantities u require"+q2);
        System.out.println("prize is"+q2*f1);
        
        totalbill=totalbill+(q2*f1);
        int k2=fb-totalbill;
                System.out.println("your bill is"+totalbill);
        int b2=l-q2;
        f=b2;
        System.out.println("available bal is"+k2+"available quant is"+b2);
        //count++;
        if(k2>=0)
            display();
        else
            break;
    case 4:
        System.out.println("there are "+g+"quantities");
        int q3=sc.nextInt();
        System.out.println("how many quantities u require"+q3);
        System.out.println("prize is"+q3*g1);
        
        totalbill=totalbill+(q3*g1);
        int k3=fb-totalbill;
        System.out.println("your bill is"+totalbill);
        int b3=l-q3;
        g=b3;
        System.out.println("available bal is"+k3+"available quant is"+b3);
        //count++;
        if(k3>=0)
            display();
        else
            break;
    case 5:
        System.out.println("there are "+c+"quantities");
        int q4=sc.nextInt();
        System.out.println("how many quantities u require"+q4);
        System.out.println("prize is"+q4*c1);
        
        totalbill=totalbill+(q4*c1);
        int k4=fb-totalbill;
        System.out.println("your bill is"+totalbill);
        int b4=l-q4;
        c=b4;
        System.out.println("available bal is"+k4+"available quant is"+b4);
        
        if(k4>0)
            display();
        else
            break;
        
        count++;
    }
}while(ch!=0)

}
