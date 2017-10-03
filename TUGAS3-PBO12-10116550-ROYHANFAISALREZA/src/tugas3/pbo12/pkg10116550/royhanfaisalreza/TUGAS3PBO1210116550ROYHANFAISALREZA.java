/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3.pbo12.pkg10116550.royhanfaisalreza;

/**
 *
 * @author RFR
 * Nama     : Royhan Faisal Reza
 * NIM      : 10116550
 * Kelas    :PBO-12
 */
class nilaiMahasiswa{
    private String name;
    private String nim;
    private double value1;
    private double value2;
    private double value3;  
    private char indx;
    private String ket;
    
    /*private char index;
    private String ket;*/
    

    
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim=nim;
    }
    public double getValue1(){
        return value1;
    }
    public void setValue1(double value1){
        this.value1=value1;
    }
    public double getValue2(){
        return value2;
    }
    public void setValue2(double value2){
        this.value2=value2;
    }
    public double getValue3(){
        return value3;
    }
    public void setValue3(double value3){
        this.value3= value3;
    }
    public double nilaiAkhir(double quiz, double uts, double uas){
        return (quiz * 0.2) + (uts * 0.3) + (uas * 0.5);
    }
    public char index(double nilaiAkhir){
        
        if(nilaiAkhir >= 80){
            indx = 'A';
        }
        else if(nilaiAkhir >= 68){
            indx = 'B';
        }
        else if(nilaiAkhir >= 56){
            indx = 'C';
        }
        else if(nilaiAkhir >= 45){
            indx = 'D';
        }
        else{indx = 'E';}
        return 0;
        
    }
    
    public void keterangan(char index){
        switch(indx){
            case 'A' :
                System.out.println("Index \t \t = "+indx);
                System.out.println("Keterangan \t = Sangat Baik");
                break;
            case 'B' :
                System.out.println("Index \t \t = "+indx);
                System.out.println("Keterangan \t = Baik");
                break;
            case 'C' :
                System.out.println("Index \t \t = "+indx);
                System.out.println("Keterangan \t = Cukup");
                break;
            case 'D' :
                System.out.println("Index \t \t = "+indx);
                System.out.println("Keterangan \t = Kurang");
                break;
            case 'E' :
                System.out.println("Index \t \t = "+indx);
                System.out.println("Keterangan \t = Sangat Kurang");
                break;
                
                default: System.out.println(".........");
        }
    }
    



}
        
public class TUGAS3PBO1210116550ROYHANFAISALREZA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nilaiMahasiswa oNmhs= new nilaiMahasiswa();
        oNmhs.setName("Royhan Faisal Reza");
        oNmhs.setNim("10116550");
        oNmhs.setValue1(75);
        oNmhs.setValue2(45);
        oNmhs.setValue3(34);
        
        
        int i;
        int j;
                
        for(i=1;i<=4;i++){
            System.out.println("Nama ke "+i+"\t = "+oNmhs.getName());
        }
        for(j=8;j>=1;j--){
            System.out.println("NIM ke "+j+"\t = "+oNmhs.getNim()+"."+j);
        }
        
        System.out.println("\nQUIZ \t \t = "+oNmhs.getValue1());
        System.out.println("UTS \t \t = "+oNmhs.getValue2());
        System.out.println("UAS \t \t = "+oNmhs.getValue3());
        System.out.println("\nNilai Akhir \t = "+oNmhs.nilaiAkhir(oNmhs.getValue1(), oNmhs.getValue2(), oNmhs.getValue3()));
        oNmhs.keterangan(oNmhs.index(oNmhs.nilaiAkhir(oNmhs.getValue1(), oNmhs.getValue2(), oNmhs.getValue3())));
        
    }
    
}
