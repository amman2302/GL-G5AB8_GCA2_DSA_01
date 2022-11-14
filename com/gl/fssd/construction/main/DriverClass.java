package com.gl.fssd.construction.main;

import java.util.*;

import com.gl.fssd.construction.algo.Construction;

public class DriverClass {
    public static void main(String[] strArg)
    {
         try{
                Scanner objSc = new Scanner(System.in);
                System.out.println("Enter the total no of floors in the building");
                int iTotFloor = objSc.nextInt();  
                int iArrFloorSize[] = new int[iTotFloor];
                for(int iCnt=1;iCnt <= iTotFloor;iCnt++)
                {
                    System.out.println("Enter the floor size given on day "+iCnt );
                    iArrFloorSize[iCnt-1]=objSc.nextInt();
                }
                Construction objConstruction = new Construction();
                objConstruction.printConstructionPlan(iArrFloorSize, iTotFloor);
            }catch(Exception oException){
              System.out.println("Exception occured "+oException.getMessage());
            }//End of try-catch block  
    }//End of main method
}//End of DriverClass