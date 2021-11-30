 /* 
 ​ * To change this license header, choose License Headers in Project Properties. 
 ​ * To change this template file, choose Tools | Templates 
 ​ * and open the template in the editor. 
 ​ ​*/ 
 ​package​ ​rentalconsolegame​; 
  
 ​/** 
 ​ * 
 ​ * ​@author​ Fahira 
 ​ ​*/ 
 ​public​ ​class​ ​GoldMember​ ​extends​ ​SilverMember​ { ​//​Menggunakan Extends karena class GoldMember merupakan subclass dari class SilverMember. 
 ​     
 ​    ​private int​ ​Cashback​, hargaSewa ​=​ ​30000​; //di-set Private karena merupakan atribut sensitif
 ​    ​double​ Diskon ​=​ ​2​/​100​; ​//​Diskon untuk Member Gold (2%) 
 ​    
     @Override
     //Method Setter untuk memanggil atribut private saat di main class
     public void setHargaSewa(int hargaSewa){
       if(hargaSewa > 0){
         this.hargaSewa = hargaSewa;
       } else{
         this.hargaSewa = 0;
       }
     }
 ​     
 ​    @Override 
 ​    ​protected​ ​void​ ​Benefit1​(​long​ ​berapaLama​){ ​//​Access Modifier: Protected 
 ​        double​ biayaSewa ​=​ ​this​.​hargaSewa ​*​ berapaLama; 
 ​        double​ ​Total​ ​=​ biayaSewa ​-​ (biayaSewa​*​this​.​Diskon​); 
 ​        S​​ystem​.​out​.​println(​"​Total Sewa      : Rp​"​ ​+​ ​Total​); 
 ​    } 
 ​     
 ​    @Override 
 ​    protected​ ​void​ ​Benefit2​(​long​ ​berapaLama​){ ​//​Access Modifier: Protected 
 ​        Point​ ​=​ berapaLama ​*​ ​5​; ​//​Point: 5/hari 
 ​        System​.​out​.​println(​"​Jumlah Poin     : ​"​ ​+​ ​Point​); 
 ​    } 
 ​    
     //Method Getter
 ​    public int getCashback(){
         return this.Cashback;
     }
 ​}