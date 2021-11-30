 /* 
 ​ * To change this license header, choose License Headers in Project Properties. 
 ​ * To change this template file, choose Tools | Templates 
 ​ * and open the template in the editor. 
 ​ ​*/ 
 ​package​ ​rentalconsolegame​; 
 ​import​ ​java.util.ArrayList​; 
  
 ​/** 
 ​ * 
 ​ * ​@author​ Fahira 
 ​ ​*/ 
 ​public​ ​class​ ​Member​ { 
 ​     
 ​    ​ArrayList<​Membership​>​ dataMember ​=​ ​new​ ​ArrayList<​Membership​>​(); 
 ​     
 ​    ​//​Method 
 ​    ​void​ ​addMember​(​Membership​ ​Data​){ ​//​Menambah Data (Member) 
 ​        ​this​.​dataMember​.​add(​Data​); 
 ​    } 
 ​     
 ​    ​void​ ​findMember​(​String​ ​ID​){ ​//​Mencari Data Member 
 ​        ​boolean​ ​Find​ ​=​ ​false​; 
 ​        ​int​ index ​=​ ​-​1​; 
 ​         
 ​        ​for​(​int​ i ​=​ ​0​; i ​<​ ​this​.​dataMember​.​size(); i​++​){ 
 ​            ​if​(​this​.​dataMember​.​get(i)​.​ID_Member​.​equals(​ID​)){ 
 ​                index ​=​ i; 
 ​                ​Find​ ​=​ ​true​; 
 ​            } 
 ​        } 
 ​         
 ​        ​if​(​Find​ ​==​ ​true​){ 
 ​            ​this​.​dataMember​.​get(index)​.​printMember(); 
 ​        } 
 ​        ​else​{ 
 ​            ​System​.​exit(​0​); 
 ​        } 
 ​    } 
 ​}