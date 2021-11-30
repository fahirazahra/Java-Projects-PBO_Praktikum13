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
 ​public​ ​class​ ​Membership​ { 
 ​     
 ​    ​String​ ​ID_Member​, ​Nama​, ​Jenis​; 
 ​     
 ​    ​//​Constructor 
 ​    ​Membership​(​String​ ​ID​, ​String​ ​nama​, ​String​ ​jenis​){ 
 ​        ​this​.​ID_Member​ ​=​ ​ID​; 
 ​        ​this​.​Nama​ ​=​ nama; 
 ​        ​this​.​Jenis​ ​=​ jenis; 
 ​    } 
 ​     
 ​    ​//​Method 
 ​    ​void​ ​printMember​(){ 
 ​        ​System​.​out​.​println(​"​ID Member       : ​"​ ​+​ ​this​.​ID_Member​); 
 ​        ​System​.​out​.​println(​"​Nama Member     : ​"​ ​+​ ​this​.​Nama​); 
 ​        ​System​.​out​.​println(​"​Jenis Member    : ​"​ ​+​ ​this​.​Jenis​); 
 ​    } 
 ​}