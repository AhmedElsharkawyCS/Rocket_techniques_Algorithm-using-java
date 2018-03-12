
package rockets;

import java.util.Scanner;


public class Rockets {

    String name;
    float accelaration;
    float v0;
    float v;
    float total_distance;
    float distance;
    float time;
    
        
    
    
     //buuble Sorting
    
    public void sort(Rockets r[], int rockets_num) {
       
        boolean swap = true;
        int counter = 0;
       Rockets temp[] = new Rockets[1];
        while (swap) {
            swap = false;
            counter++;
            for (int i = 0; i < rockets_num - counter; i++) {
                if ((r[i].accelaration * r[i].time) < (r[i + 1].accelaration * r[i + 1].time)) {
                    temp[0] = new Rockets();
                    temp[0] = r[i];
                    r[i] = r[i + 1];
                    r[i + 1] = temp[0];
                    swap = true;
                }
            }
        }
    }
    
    
    
    //calculate distance
    
    public void calculate_distance(float vv) {
        distance = (float) ((vv * time) + (0.5 * (accelaration * time * time)));
    }

    
    //set information
    
  public void information(Rockets r[], int rockets_num , float vv) {
        for (int i = 0; i < rockets_num ; i++) {
            r[i].calculate_distance(vv);
            r[i].v0 = vv;
            vv = r[i].v0 + (r[i].accelaration * r[i].time);
             r[i].v = vv;           
            total_distance += r[i].distance;
     }
  } 
}
