
package gui;

/**
 *
 * @author DELL
 */
public class Backuprestorecode {
 
 public String backupDB(String path){
     
   String msg=null;
   
     try {
         Runtime runtime = Runtime.getRuntime();
         Process p =  runtime.exec("");
         
         int processComplete = p.waitFor();
         System.out.println("process done"+processComplete);
         msg = "success";
         
     } catch (Exception e) {
         e.printStackTrace();
         msg = "error "+e.getMessage();
     }
     return msg;
 }
    
    
    
    
    
}
