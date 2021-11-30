 /* 
 ​ * To change this license header, choose License Headers in Project Properties. 
 ​ * To change this template file, choose Tools | Templates 
 ​ * and open the template in the editor. 
 ​ ​*/ 
 ​package​ ​rentalconsolegame​; 
 ​import​ ​java.util.Scanner​; 
  
 ​/** 
 ​ * 
 ​ * ​@author​ Fahira 
 ​ ​*/ 
 ​public​ ​class​ ​TanggalRental​ { 
 ​     
 ​    ​int​ tglPinjam, bulanPinjam, tahunPinjam, tglKembali, bulanKembali, tahunKembali; 
 ​    ​Scanner​ inputData ​=​ ​new​ ​Scanner​(​System​.​in); 
 ​     
 ​    ​void​ ​Pinjam​(){ 
 ​        ​System​.​out​.​println(​"​Masukkan Tanggal Pinjam (1-31)  : ​"​); 
 ​        ​this​.​tglPinjam ​=​ inputData​.​nextInt(); 
 ​        ​System​.​out​.​println(​"​Masukkan Bulan Pinjam (1-12)    :​"​); 
 ​        ​this​.​bulanPinjam ​=​ inputData​.​nextInt(); 
 ​        ​System​.​out​.​println(​"​Masukkan Tahun Pinjam           :​"​); 
 ​        ​this​.​tahunPinjam ​=​ inputData​.​nextInt(); 
 ​    } 
 ​     
 ​    ​void​ ​Kembali​(){ 
 ​        ​System​.​out​.​println(​"​Masukkan Tanggal Kembali (1-31) : ​"​); 
 ​        ​this​.​tglKembali ​=​ inputData​.​nextInt(); 
 ​        ​System​.​out​.​println(​"​Masukkan Bulan Kembali (1-12)   :​"​); 
 ​        ​this​.​bulanKembali ​=​ inputData​.​nextInt(); 
 ​        ​System​.​out​.​println(​"​Masukkan Tahun Kembali          :​"​); 
 ​        ​this​.​tahunKembali ​=​ inputData​.​nextInt(); 
 ​        ​System​.​out​.​println(​"​=================================​"​); 
 ​    } 
 ​}