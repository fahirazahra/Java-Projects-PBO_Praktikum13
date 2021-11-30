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
 ​public​ ​class​ ​PlatinumMember​ ​extends​ ​GoldMember​ { ​//​Menggunakan Extends karena class PlatinumMember merupakan subclass dari class GoldMember. 
 ​     
 ​    ​private int​ hargaSewa ​=​ ​45000​; //di-set Private karena merupakan atribut sensitif
 ​    double​ Diskon ​=​ ​3​/​100​; ​//​Diskon untuk Member Platinum (3%) 
 ​    ​long​ ​Pulsa​;
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
 ​    protected​ ​void​ ​Benefit1​(​long​ ​berapaLama​){ ​//​Access Modifier: Protected 
 ​        double​ biayaSewa ​=​ ​this​.​hargaSewa ​*​ berapaLama; 
 ​        double​ ​Total​ ​=​ biayaSewa ​-​ (biayaSewa​*​this​.​Diskon​); 
 ​        System​.​out​.​println(​"​Total Sewa      : Rp​"​ ​+​ ​Total​); 
 ​    } 
 ​     
 ​    @Override 
 ​    protected​ ​void​ ​Benefit2​(​long​ ​berapaLama​){ ​//​Access Modifier: Protected 
 ​        Point​ ​=​ berapaLama ​*​ ​10​; ​//​Point: 10/hari 
 ​        System​.​out​.​println(​"​Jumlah Poin     : ​"​ ​+​ ​Point​); 
 ​    } 
 ​     
 ​    @Override 
 ​    ​//Method Getter
 ​    ​public int getCashback(){
         return this.Cashback;
     } 
 ​     
 ​    ​protected​ ​void​ ​Benefit4​(​long​ ​berapaLama​){ ​//​Access Modifier: Protected 
 ​        ​this​.​Pulsa​ ​=​ berapaLama ​*​ ​5000​; 
 ​        System​.​out​.​println(​"​Bonus Pulsa     : Rp​"​ ​+​ ​this​.​Pulsa​); 
 ​    } 
 ​}