
package rockets;

import java.util.Scanner;


public class MainClass {
    
        public static void main(String[] args) {
            
        Rockets r = new Rockets();
        int rockets_num;
        float vv = 0;
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Rockets : ");
       rockets_num = sc.nextInt();
        Rockets roc[] = new Rockets[rockets_num];
        
        
        //set data of rockets

        for (int i = 0; i < rockets_num; i++) {
               roc[i] = new Rockets();
               
               Scanner scan = new Scanner(System.in);
     
        roc[i].name=("Rocket"+(i+1));
        System.out.print("Enter the "+roc[i].name+" accelaration : ");
        float acc = scan.nextFloat();
        roc[i].accelaration=acc;
        System.out.print("Enter the " +roc[i].name+" time : ");
        float t = scan.nextFloat();
        roc[i].time=t;
        
        }
        
        //bubble Sort
        
        r.sort(roc, rockets_num);

//get information
        
   r.information(roc, rockets_num , vv);

        for (int i = 0; i < rockets_num ; i++) {
                 
        System.out.println("name : "+roc[i].name + "  " + "accelaration : "+roc[i].accelaration + "  " + "time : "+roc[i].time + "   " + "start velocity : "+roc[i].v0 + "   " + "final velocity : "+roc[i].v);
       
        }

        System.out.println("Total Distance = " + r.total_distance);
    }
        }

