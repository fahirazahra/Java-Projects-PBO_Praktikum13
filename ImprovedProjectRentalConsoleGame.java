 /* 
 ​ * To change this license header, choose License Headers in Project Properties. 
 ​ * To change this template file, choose Tools | Templates 
 ​ * and open the template in the editor. 
 ​ ​*/ 
 ​package​ ​rentalconsolegame​; 
 ​import​ ​java.util.Scanner​; 
 ​import​ ​java.time.LocalDate​; 
 ​import​ ​java.time.format.DateTimeFormatter​; 
 ​import​ ​java.time.temporal.ChronoUnit​; 
  
 ​/** 
 ​ * 
 ​ * ​@author​ Fahira 
 ​ ​*/ 
 ​public​ ​class​ ​ProjectRentalConsoleGame​ { 
 ​    ​/** 
 ​     * ​@param​ args the command line arguments 
 ​     ​*/ 
 ​    ​public​ ​static​ ​void​ ​main​(​String​[] ​args​) { 
 ​        ​//​ TODO code application logic here 
 ​         
 ​        ​String​ ​ID​; 
 ​         
 ​        ​//​Objek 
 ​        ​Member​ ​Data​ ​=​ ​new​ ​Member​(); 
 ​        ​TanggalRental​ waktuSewa ​=​ ​new​ ​TanggalRental​(); 
 ​         
 ​        Scanner​ inputData ​=​ ​new​ ​Scanner​(​System​.​in); 
 ​        DateTimeFormatter​ ​Formatter​ ​=​ ​DateTimeFormatter​.​BASIC_ISO_DATE​; 
 ​         
 ​        ​//​Array List 
 ​        ​Data​.​addMember(​new​ ​Membership​(​"​M001​"​, ​"​Fahira​"​, ​"​Silver​"​)); 
 ​        ​Data​.​addMember(​new​ ​Membership​(​"​M002​"​, ​"​Zahra​"​, ​"​Gold​"​)); 
 ​        ​Data​.​addMember(​new​ ​Membership​(​"​M003​"​, ​"​Fara​"​, ​"​Platinum​"​)); 
 ​         
 ​        ​//​Input 
 ​        System​.​out​.​println(​"​Masukkan ID Member  : ​"​); 
 ​        ID​ ​=​ inputData​.​nextLine(); 
 ​         
 ​        waktuSewa​.​Pinjam​(); 
 ​        waktuSewa​.​Kembali​(); 
 ​         
 ​        ​//​Output 
 ​        Data​.​findMember(​ID​.​toUpperCase()); ​//​Untuk mencari Member 
 ​         
 ​        ​//​Peminjaman 
 ​        LocalDate​ waktuPinjam ​=​ ​LocalDate​.​of(waktuSewa​.​tahunPinjam, waktuSewa​.​bulanPinjam, waktuSewa​.​tglPinjam); 
 ​        String​ formatPinjam ​=​ waktuPinjam​.​format(​Formatter​); 
 ​        LocalDate​ parsedPinjam ​=​ ​LocalDate​.​parse(formatPinjam, ​Formatter​); 
 ​         
 ​        ​//​Pengembalian 
 ​        LocalDate​ waktuKembali ​=​ ​LocalDate​.​of(waktuSewa​.​tahunKembali, waktuSewa​.​bulanKembali, waktuSewa​.​tglKembali); 
 ​        String​ formatKembali ​=​ waktuPinjam​.​format(​Formatter​); 
 ​        LocalDate​ parsedKembali ​=​ ​LocalDate​.​parse(formatKembali, ​Formatter​); 
 ​         
 ​        long​ berapaLama ​=​ ​ChronoUnit​.​DAYS​.​between(waktuPinjam, waktuKembali); ​//​Perhitungan lamanya console game disewakan. 
 ​         
 ​        ​System​.​out​.​println(​"​Tanggal Pinjam  : ​"​ ​+​ parsedPinjam); 
 ​        ​System​.​out​.​println(​"​Tanggal Kembali : ​"​ ​+​ parsedKembali); 
 ​        ​System​.​out​.​println(​"​Lama Sewa       : ​"​ ​+​ berapaLama ​+​ ​"​ hari ​"​); 
 ​         
 ​        ​//​Switch (Penentuan Jenis Member) 
 ​        ​int​ index ​=​ ​-​1​; 
 ​        ​for​(​int​ i ​=​ ​0​; i ​<​ ​Data​.​dataMember​.​size(); i​++​){ 
 ​            ​if​(​Data​.​dataMember​.​get(i)​.​ID_Member​.​equals(​ID​)){ 
 ​                index ​=​ i; 
 ​                switch​(​Data​.​dataMember​.​get(i)​.​Jenis​){ 
 ​                    case​ ​"​Silver​"​: 
 ​                        SilverMember​ ​Silver​ ​=​ ​new​ ​SilverMember​();
                         Silver.setHargaSewa(25000); //Pemanggilan atribut Private dengan method Setter yang sudah dibuat sebelumnya       
 ​                        Silver​.​Benefit1(berapaLama); 
 ​                        Silver​.​Benefit2(berapaLama); 
 ​                        ​break​; 
 ​                    ​case​ ​"​Gold​"​: 
 ​                        GoldMember​ ​Gold​ ​=​ ​new​ ​GoldMember​();
                         Gold.setHargaSewa(30000); //Pemanggilan atribut Private dengan method Setter yang sudah dibuat sebelumnya
 ​                        Gold​.​Benefit1(berapaLama); 
 ​                        Gold​.​Benefit2(berapaLama); 
 ​                        System​.​out​.​println(​"​Cashback : ​"​ ​+​ Gold.getCashback); //Pemanggilan method Getter
 ​                        break​; 
 ​                    case​ ​"​Platinum​"​: 
 ​                        PlatinumMember​ ​Platinum​ ​=​ ​new​ ​PlatinumMember​();
                         Platinum.setHargaSewa(45000); //Pemanggilan atribut Private dengan method Setter yang sudah dibuat sebelumnya
 ​                        Platinum​.​Benefit1(berapaLama); 
 ​                        Platinum​.​Benefit2(berapaLama); 
 ​                        System​.​out​.​println(​"​Cashback : ​"​ ​+​ Platinum.getCashback); //Pemanggilan method Getter
 ​                        Platinum​.​Benefit4(berapaLama); 
 ​                        break​; 
 ​                    default​: 
 ​                        System​.​exit(​0​); 
 ​                } 
 ​            } 
 ​        } 
 ​    } 
 ​}