package com.gl.fssd.construction.algo;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.lang.Integer;

public class Construction {

    public void printConstructionPlan(int iArrFloorSize[],int iNoFloors)
    {
        try
        {
            Queue<Integer> objQueue = new PriorityQueue<Integer>(new ConstructionComparator());
            int iMaxFloor = iNoFloors;
            for(int iCount=1;iCount<=iNoFloors;iCount++)
            {
                objQueue.add(iArrFloorSize[iCount-1]);
                System.out.println("Day "+iCount+" :");
                while(!objQueue.isEmpty() && objQueue.peek()==iMaxFloor)
                {
                    System.out.print(objQueue.poll() + " ");
                    iMaxFloor--;
                 }
                System.out.println();     
            }//End of for loop
        }catch(Exception objException){
            System.out.println(objException);
        }//End of exception.
    }//End of printConstructionPlan
}
class ConstructionComparator implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        Integer objI1=(Integer)obj1;
        Integer objI2=(Integer)obj2;
        return objI2.compareTo(objI1);
    }
}//End of ConstructionComparator class