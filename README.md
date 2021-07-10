# Crud_film_app
Bu projede HTML, Bootstrap, MySql, Hibernate, Thymleaf ve Spring Boot teknolojileri kullanılmıştır. Projeye genel olarak bakıldığında film ekleme, güncelleme ve silme işlemleri yapılmaktadır.
Proje lokalde çalışmaktadır, herhangi bir bulut veritabanı teknolojisi kullanılmamıştır.
Projeyi çalıştırmak için öncelikle git aracılığı ile veya zip olarak proje dosyalarını indirmelisiniz.
Ardından indirilen dosyaları eclipse veya intellij Idea tarzında bir IDE'ye eklemelisiniz.
Mysql veritabanınız indirilmiş olmalı ve içerisinde create database demo; komutunu çalıştırmalısınız.
Ardından CrudFilmAppApplication class'ını bulup içerisine sağ click yaparak run as spring app seçeneğini seçmelisiniz.
Son olarak chrome veya herhangi başka bir tarayıcıya gidip http://localhost:8080/ adresine gitmelisiniz.
İşte şimdi veritabanına eklemeler, silmeler veya güncellemeler yapabilirsiniz.
Not: 8080 port is already in use tarzında bir uyarı almanız durumunda cmd(komut istemini) yönetici olarak çalıştırmalısınız.
Ardından şu iki komutu çalıştırmalısınız(... yerine ilk komutu çalıştırdıktan sonra gelen pid yazılmalıdır).
netstat -ano | findstr 8080
taskkill /F /pid ...
Uygulamanın demo videosuna https://www.youtube.com/watch?v=sgYN5WbYdLE linkinden ulaşabilirsiniz.
